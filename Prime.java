package assignment;
import java.util.*;
public class Prime {
  public boolean isPrime(int number) {

	boolean flag=true;
	
	// to calculate the is it prime number and return the flag
	for(int i=1;i<=number;i++)
	{    
		flag=true;
		for(int j=2;j<=i/2;j++)
			if(i%j==0)
			{
				flag=false;
				break;
				 
			}
		
	}	
	  return flag;
		
	
}
  /* is prime() is a method to check the no is prime or not 
	 * input - number
	 * output - result in boolean form 
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		Prime p= new prime();
		if(number==0||number==1) 
		  System.out.println("please give value more than 1");
		  else {
                          if(p.isPrime(number))
			     System.out.println("yes it is prime number");
			  else
                              System.out.println("not it is a prime number");

		  }
				
	

	}
		
		
}
