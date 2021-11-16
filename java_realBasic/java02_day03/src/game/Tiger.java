package game;

public class Tiger extends Animal{

	public Tiger(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
	public void tiger()
	{
		System.out.println("어흥 어흥");
	}
	@Override
	public boolean eat() {
		if(feed<5)
		{
			return false;
		}
		else
		{
			feed-= 5;
			hp+=5;
			if(hp>=max_hp)
			{
				hp = max_hp;
			}
			return true;
		}
	}
	
	@Override
	public boolean walk() {
		if(hp < 5)
		{
			return false;
		}
		else
		{
			hp-=5;
			return true;
		}
	}
	@Override
	public void rest() {
//		System.out.print("잠을 잡니다");
//		for (int i = 0; i < 3; i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.print(".");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		hp = max_hp;
		//부모 메서드를 그대로 활요하고 마지막에 추가적으로 음식의 갯수만 더 감소시킨다
		super.rest();
		feed +=4;
//		System.out.println();
	}
}
