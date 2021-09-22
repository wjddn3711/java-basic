package game;

public class Dog extends Animal {

	public Dog(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}

	public void dog()
	{
		System.out.println("멍멍");
	}
	@Override
	public boolean eat() {
		if(feed< 2)
		{
			return false;
		}
		else
		{
			feed-= 2;
			hp++;
			if(hp>=max_hp)
			{
				hp = max_hp;
			}
			return true;
		}
	}
	
	@Override
	public boolean walk() {
		if(hp < 10)
		{
			return false;
		}
		else
		{
			hp-=10;
			return true;
		}
	}
	@Override
	public void rest() {
		System.out.print("잠을 잡니다");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(".");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		hp = max_hp;
		feed +=3;
		System.out.println();
	}
}
