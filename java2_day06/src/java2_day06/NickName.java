package java2_day06;

public class NickName {
	public void checkNickName(String nick) throws BadWordException,ArrayIndexOutOfBoundsException
	{
		if(nick.equals("바보"))
		{
			throw new BadWordException();
		}
	}
}
