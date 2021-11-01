import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String openMenu = "반갑습니다. 당신의 표준체중과 BMI 수치를 알려드립니다.";
        String menu = "1. BMI 수치란?\n2. 나의 표준체중 구하기\n3. 종료";
        String whatsBmi = "비만 판정하는 방법의 하나로 체지방 축적을 잘 반영하기 때문에 비만도 판정에 많이 사용한다.\n" +
                "신체지수에 의한 비만의 분류는 정상 : BMI 20~25\n" +
                "과체중(1도 비만) : BMI 25~29.9\n" +
                "비만(2도 비만) : BMI 30~40\n" +
                "고도비만 : BMI 40.1 이상을 말한다.\n";
        int cnt = 0;

//        System.out.println(ps1);  toString 결과 --> PersonalStatus{weight=25, sex='남자', height=165}
        Scanner sc = new Scanner(System.in);

        System.out.println(openMenu);
        while (true){
            System.out.println(menu);
            int choice = sc.nextInt();
            if (choice == 3) break;
            // 나의 표준 체중 구하기
            else if (choice == 1){
                System.out.println(whatsBmi);
            }
            else if (choice == 2){
                while (true){
                    System.out.print("당신의 체중(kg): ");
                    int w = sc.nextInt();
                    System.out.print("당신의 키(cm): ");
                    int h = sc.nextInt();
                    System.out.print("당신의 성별(Boy, Girl): ");
                    String s = sc.next();
                    PersonalStatus p = new PersonalStatus(w,s,h);
                    if (p.getProperWeight()==0){
                        System.out.println("\n올바른 형식으로 입력해주세요.\n");
                    }
                    else {
                        System.out.println("당신의 표준 체중은 "+p.getProperWeight());
                        System.out.println(p.getBmi());
                        break;
                    }
                }

            }
            else {
                System.out.println("올바른 형태로 입력해주세요");
            }
        }
    }
}
