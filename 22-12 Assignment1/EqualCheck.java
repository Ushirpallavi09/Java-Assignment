package Assignment;

public class EqualCheck {

	public static void main(String[] args) {
		String a="Pihu";
		String b="PIHU";
		if(a.equals(b))
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");
			
		}
		if(b.equalsIgnoreCase(a))
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");	
		}

	}

}
