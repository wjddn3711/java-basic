import java.util.*;

public class TreasureExpedition {
    static int a,b; // 보물의 위치를 전역변수로 설정하여 좌표를 기억한다
    static int bound; // 보물 맵의 크기또한 전역 변수로 설정한다
    static String[] move = {"u","d","l","r"};
    static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
    static String trapBox = String.format("%-7s","☒");
    static String box = String.format("%-7s","☐");
    static String treasure = String.format("%-7s","❀");
    static String player = String.format("%-7s","⚉");
    static int pX = 0; // 플레이어의 현재 위치
    static int pY = 0;
    static class Point {
        int row, col, dist;
        Point(int r, int c, int d){
            row = r;
            col = c;
            dist = d;
        }
    }

    /* 텍스트파일에 이름과 스코어를 기록 가능 하도록 구현 예정
    룰 설명:
    보물섬의 맵 크기를 설정 받는다 ( 소, 중, 대 로 구분하여 받는다 ) 3*3, 5*5, 7*7 을 기준으로 받는다 (각 1점, 2점, 5점 적립)
    각 맵당 장애물이 1, 2, 4개 만들어 진다
    1. 보물의 위치는 매 게임마다 변경된다
    2. 매번 움직일때 마다 턴이 소요되며 최소 이동수에서 +2 까지의 기회가 주어진다
    3. 만약 턴수를 모두 소모했는데도 탈출 할 수 없다면 실패
    4. 만약 보물을 얻었다면 포인트를 얻는다
    5. 보물을 얻거나 턴수를 모두 소모했을 때 더 게임을 진행할 지 묻는다
     */

    // 장애물 생성
    public static HashMap<Integer,Integer> trap (String type){ // 타입을 매개변수로 s,m,l 로 맵의 크기를 받아온다
        Random rand = new Random();
        HashMap<Integer,Integer> t = new HashMap<>();
        if (type.equals("s")){ // s 맵은 3*3 이다
            int x = rand.nextInt(2)+1; // 0,0 부터 시작하기 때문에 0번째 행은 건너뛴다
            int y = rand.nextInt(3);
            t.put(x,y);
        }
        else if (type.equals("m")){ // m 맵은 5*5 이다
            while (t.size() < 3){ // 장애물 좌표가 3개 만들어 질 때 까지 생성
                int x = rand.nextInt(4)+1; //1~5까지 생성
                int y = rand.nextInt(5);
                t.put(x,y);
            }
        }
        else { // l 크기의 맵일 때 7*7
            while (t.size() < 5){
                int x = rand.nextInt(6)+1; //1~7까지 생성
                int y = rand.nextInt(7);
                t.put(x,y);
            }
        }
        return t;
    }

    // 보물섬 맵 생성
    public static String[][] tMap (HashMap<Integer,Integer> map, String type) {
        // 트랩을 매개변수로 받아와 트랩을 기준으로 보물섬 맵을 생성한다
        // 리스트에 좌표값들을 모두 담아준다
        Iterator<Integer> keys = map.keySet().iterator();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while(keys.hasNext()){
            ArrayList<Integer> item = new ArrayList<>();
            int key = keys.next();
            item.add(key);
            item.add(map.get(key));
            list.add(item);
        }
        // s, m, l 의 맵 크기일때의 맵 크기를 전역변수 bound 에 담아준다
        if (type.equals("s")){
            bound = 3;
        }
        else if(type.equals("m")){
            bound = 5;
        }
        else {
            bound = 7;
        }
        
        String [][] arr = new String[bound][bound];
        // 우선 전체 맵을 O 로 채워준다
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = box;
            }
        }
        // 트랩이 있는 위치는 X 로 바꿔준다
        for (int i = 0; i < list.size(); i++) {
            arr[list.get(i).get(0)][list.get(i).get(1)] = trapBox; // 리스트의 저장된 좌표(트랩이 있는 곳은) X로 채움
        }
        return arr;

    }

    public static String[][] fMap (String type, String[][] arr){
        Random rand = new Random();
        while (true){
            a = rand.nextInt(bound-1)+1;
            // 각 맵당 해당하는 맵의 범위 내에 생성한다, 최소 1회 움직이도록 하기위해 보물의 위치는 0행에는 위치할 수 없도록 한다
            b = rand.nextInt(bound);
            if (arr[a][b].equals(box)){
                arr[a][b] = treasure; // 보물의 위치는 별로 표시한다

                break; // 보물 위치 기록 후 탈출
            }
        }
        return arr;
    }

    public static int dfs(int x,int y,String[][] fmap){ // 마지막으로 완성된 맵을 매개변수로 받아와 Dfs를 수행한다
        boolean[][] visited = new boolean[bound][bound];
        Queue<Point> q = new LinkedList<>(); // 큐를 링크드리스트 타입으로
        visited[x][y] = true; // 0,0 부터 시작하여 해당 시작좌표를 방문처리한다
        q.add(new Point(x,y,0)); // 큐에 시작 좌표와 움직인 거리를 넣는다
        while (!q.isEmpty()){
            // 큐가 빌때 까지 계속 진행
            Point curr = q.remove();
            if (curr.row==a && curr.col==b) // 만약 목표 좌표라면 거리값을 리턴한다
                return curr.dist;
            for (int i = 0; i < 4; i++) { // 상하좌우 움직였을때의 좌표를 nr,nc 로
                int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
                if (nr < 0 || nr > bound - 1 || nc < 0 || nc > bound - 1) {
                    continue; // 만약 움직인후의 좌료가 맵을 벗어난다면 무시
                }
                if (visited[nr][nc] || fmap[nr][nc].equals(trapBox)) {
                    continue; // 만약 이미 방문한 곳이거나 이동위치가 장애물일때 무시
                }
                visited[nr][nc] = true;
                q.add(new Point(nr, nc, curr.dist + 1)); // 큐에 이동좌표와 거리를 1증가시키고 삽입한다
            }
        }
        return -1; // 해당 위치로 가지 못할경우 -1
    }

    public static void main(String[] args) {
        String error="\n\n\n해당 위치로는 이동할 수 없습니다. (*꒦ິㅿ꒦ີ)\n\n\n";
        System.out.println("보물섬의 세상에 오신것을 환영합니다\n\n");
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            pX = 0; // 게임 이용후 플레이어의 위치 초기화
            pY = 0;
            System.out.println("메뉴를 선택하세요\n1. 미로게임 시작\n2. 미로게임 종료\n3. 게임 조작법보기");
            choice = sc.nextInt();
            if (choice==2){
                System.out.println("이용해주셔서 감사합니다.\n다음에 만나요(๑ Ỡ ◡͐ Ỡ๑)ﾉ♡");
                break;
            }
            else if (choice==3){
                System.out.printf("\n보물섬 세상에는 기본적으로 세가지 타입의 블럭이 있습니다\n%s :이동할 수 있는 블럭이에요 \n%s : 장애물 이며 이동할 수 없어요 \n%s : 보물의 위치에요! " +
                        "\n%s : 플레이어의 위치에요 보물까지 가야겠죠?\n커맨드는 총 u d l r 네가지 존재해요. 꼭 소문자로 입력해주세요 공백없이 커맨드 입력후 enter 하시면" +
                        "\n플레이어가 움직여요! 그럼 이제 보물을 찾으러 가볼까요?\n" +
                        "\nꉂ ฅ૮( ๑’ꇴ’๑)აฅ｡*ﾟ✧\n\n", box,trapBox,treasure,player);
            }
            else if (choice==1){
                int cnt = 0;
                int score = 0;
                String mapType = "";
                while (true){
                    System.out.println("\n맵의 크기를 설정해주세요 (s,m,l) :");
                    mapType = sc.next();
                    if (mapType.equals("s")){
                        score = 1;
                        break; // s, m, l 의 대문자나 소문자중 아무거나 제대로 입력했을 경우 반복 탈출
                    }
                    else if (mapType.equals("m")){
                        score = 2;
                        break;
                    }
                    else if (mapType.equals("l")){
                        score = 5;
                        break;
                    }
                    else {
                        System.out.println("올바른 타입의 맵으로 입력해주세요.");
                    }
                }
                HashMap<Integer,Integer> map = trap(mapType);
                String[][] island = fMap(mapType,tMap(map,mapType)); // 보물섬 생성
                int proper = dfs(0,0,island);
                System.out.printf("\n맵이 생성 되었습니다!\n        최적의 이동횟수: %d, 이동가능 횟수: %d, 누적이동 횟수: %d\n\n",proper,proper+2,cnt);
                for (int i = 0; i < island.length; i++) {
                    for (int j = 0; j < island[i].length; j++) {
                        if (i==pX && j==pY){
                            System.out.print(player);
                        }
                        else{
                            System.out.print(island[i][j]);
                        }
                    }
                    System.out.println();
                }
                while (cnt<proper+2) {
                    System.out.println("커맨드를 입력해주세요 (u:up, d:down, l:left, r:right) : ");
                    String command = sc.next();
                    int mx=0, my=0;
                    for (int i = 0; i < move.length; i++) {
                        if (command.equals(move[i])) {
                            mx = pX+D[i][0]; // 각 상하좌우 일때 좌표의 변화를 나타내는 D값을 mx,my 에 우선 저장해준다
                            my = pY+D[i][1];
                        }
                    }
                    if (mx<0 || my<0 || mx>=bound || my>=bound || island[mx][my].equals(trapBox)){
                        System.out.println(error); // 범위를 벗어났거나 장애물을 마주치면 에러 메시지 출력
                    }
                    else {
                        pX = mx; // 플레이어를 해당 위치로 이동시켜준다
                        pY = my;
                        cnt++; // 이동 횟수를 증가시킨다
                        System.out.printf("\n\n\n최적의 이동횟수: %d, 이동가능 횟수: %d, 누적이동 횟수: %d\n\n",proper,proper+2-cnt,cnt);
                        for (int i = 0; i < island.length; i++) {
                            for (int j = 0; j < island[i].length; j++) {
                                if (i==pX && j==pY){
                                    System.out.print(player);
                                }
                                else{
                                    System.out.print(island[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.println("\n\n");
                        if (pX==a && pY==b){ //보물의 위치에 도달했다면
                            System.out.printf("승리를 축하드립니다. \n%d 점을 얻으셨습니다.\n\n\n",score);
                            break; // score를 얻고 탈출
                        }
                    }
                    if (cnt==proper+2) { //해당 턴수안에 게임을 끝내지 못했다면
                        System.out.println("\n\n저런... 다음 기회를 노려보세요. (;´@̷̶̷̶̷̶̷̶̷̶̷̶̷̶̷̶̷̶̧̢̧̢̧̢̧̢̧̢̧̢̧̢̧̢̧ _ @̷̶̷̶̷̶̷̶̷̶̷̶̷̶̷̶̷̶̧̢̧̢̧̢̧̢̧̢̧̢̧̢̧̢̧`;)\n");
                    }
                }
            }
        }

    }
}
