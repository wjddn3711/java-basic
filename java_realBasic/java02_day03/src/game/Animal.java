package game;

public class Animal {
	String name;
	int hp;
	int max_hp;
	int feed;
	
	public Animal(String name, int hp, int feed) {
		super();
		this.name = name;
		this.hp = hp;
		this.max_hp = hp;
		this.feed = feed;
	}
	
	public boolean eat()
	{
		if(feed<=0)
		{
			return false;
		}
		else
		{
			feed--;
			return true;
		}
	}
	
	public boolean walk()
	{
		if(hp <=0)
		{
			return false;
		}
		else
		{
			hp--;
			return true;
		}
	}
	
	public void rest()
	{
		System.out.print("잠을 잡니다");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(".");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		hp = max_hp;
		System.out.println();
	}
	
	public void show()
	{
		System.out.println("이름: "+name);
		System.out.println("현재 체력: "+hp);
		System.out.println("먹이 갯수: "+feed);
		System.out.println("------------------------------");
	}
}
