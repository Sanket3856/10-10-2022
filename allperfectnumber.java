package oopsconcept;

import java.util.Scanner;
public class allperfectnumber {

	static boolean perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
	      {
		    if(num%i==0)
		      {
			    sum=sum+i;
	       	  }
	      }
	if(sum==num)
	    return true;
	else
		return false;
}
    public static void main(String []args)
    {
    	
    	System.out.println("Enter a value");
    	Scanner obj=new Scanner(System.in);
    	int n=obj.nextInt();
    	for(int i=1;i<=50;i++)
    	{
    		if(perfect(i))
    			System.out.println(i);
    	}
    	
    }
}
