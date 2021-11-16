package anonymousTest;

public class Jamsil extends StoreAdapter{
	//판매를 안함
	// 무료로 나눔
	// sell() 재정의 안함
	@Override 
	public String[] getMenu()
	{
		String[] items = {"농구공","축구공","야구공"};
		return items;
	}
	

}
