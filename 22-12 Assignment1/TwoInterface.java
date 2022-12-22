package Assignment;
interface Printable
  {
	void print();
  }
interface Calculate
  {
	int Cal(int p);	
  }

class CalSquare implements Calculate ,Printable
{
	public void print()
   {
	
	   System.out.println("Square of a number is :");
	
   }
	public int Cal(int p)
    {
		int q=p*p;	
        
		return q;
   }
		
}
class CalCube implements Calculate ,Printable
 {
	public void print()
   {
		System.out.println("cube of a number is :");
   }
	public int Cal(int p) 
  {
	int r=p*p*p;
	return r;
  }

}

public class TwoInterface
{
	public static void main(String[] args)
  {
		

		CalSquare S=new CalSquare();

		S.print();

		System.out.println(S.Cal(5));

		CalCube C=new CalCube();

		C.print();

		System.out.println(C.Cal(3));
		
		
	}


}