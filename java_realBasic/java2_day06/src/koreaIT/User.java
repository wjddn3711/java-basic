package koreaIT;

public class User {
	String id;
	String pw;
	String address;
	
	@Override
	public String toString() {
		String msg = "--------회원정보--------\n"
				+ "ID: " +id+"\n"
				+"PW: "+pw+"\n"
				+"Address: "+address+"\n"
				+"-------------------------";
		return msg;
	}
}
