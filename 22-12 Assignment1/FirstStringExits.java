package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class FirstStringExits {

	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String p1,p2;
			System.out.println("Enter the First name:");
			p1=br.readLine();
			System.out.println("Enter the Second name:");
			p2=br.readLine();
			System.out.println("First String:"+p1);
			System.out.println("Second String:"+p2);
			if(p1.contains(p2))
			{
				System.out.println("yes,Fist String exists in another");
				
			}
			else
			{
				System.out.println("No,First String exists in another");
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
				
			

   }
	
}	
	

	