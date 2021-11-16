package anonymousTest;

public class Gangnam implements Store{
//	String[] items = {"에어맥스","에어포스","나이키슬리퍼"};
	
	@Override // 어노테이션 
	public String[] getMenu()
	{
		String[] items = {"에어맥스","에어포스","나이키슬리퍼"};
		return items;
	}
	
	@Override 
	public void sell(String item)
	{
		for (int i = 0; i < getMenu().length; i++) {
			if(getMenu()[i].equals(item))
			{
				System.out.println("판매완료");
			}
		}
	}
}
