package throwsException;

public class ThrowsTest {
	public void show() throws InterruptedException{
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			System.out.println("안녕");
			
		}
		
	}
	

	
	
	
	public static void main(String[] args) {
		ThrowsTest t = new ThrowsTest();
		try {
			t.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
