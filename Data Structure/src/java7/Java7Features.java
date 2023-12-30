package java7;

public class Java7Features {

	public static void main(String agrs[])
	{
		// binary literals 
		
		byte ch=-0b1111111;
		
		System.out.println(ch);
		String  che="cricket";
		
		switch(che)
		{
			case("cricket"):System.out.println("value is cricket");
			break;
			case("football"): System.out.println("value is 9");
			break;
			default: System.out.println("Default value is 0");
		
		}
	}

}
