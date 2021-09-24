package anonymousTest;

public class Road {
	public static void main(String[] args) {
		Gangnam g = new Gangnam();
		Jamsil j = new Jamsil();
		Nike n = new Nike();
		n.regist(new StoreAdapter() {
			@Override
			public String[] getMenu() {
				String[] items = {"농구공","축구공","야구공"};
				return items;
			}
		});
		n.regist(new Store() {
			
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
		});
		
	}
}
