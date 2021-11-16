package interTask;

public class FirstMan implements Soldier{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("입맛이 별로 없어진다");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("제일 열심히 일을 한다");
	}

	@Override
	public void salute() {
		// TODO Auto-generated method stub
		System.out.println("충성");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("잠도 많이 잔다");
	}
	
}
