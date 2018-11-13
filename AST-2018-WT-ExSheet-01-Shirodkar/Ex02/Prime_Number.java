import java.util.Scanner;

public class Prime_Number 
	{
	   public static void main (String[] args)
	   {        
		   System.out.println("Enter a number");
		   Scanner scan = new Scanner(System.in);
		   int inp = scan.nextInt();
	       prime(inp);
	      //Empty String
	      
	   }
	   
	   public static void prime(int input) {
	      //System.out.println("Enter the value of n:");
		  
		  int val = input;
		  String  primeNumbers = "";
		  int iteration_counter =0;
		  int num =0;
	      for (iteration_counter = 1; iteration_counter <= val; iteration_counter++)         
	      {                    
	         int counter=0;           
	         for(num =iteration_counter; num>=1; num--)
	         {
	        if(iteration_counter%num==0)
	        {
	        counter = counter + 1;
	        }
	     }
	     if (counter ==2)
	     {
	        //Appended the Prime number to the String
	        //System.out.println(iteration_counter);
	        primeNumbers = primeNumbers + iteration_counter + " ";
	     }    
	      }    
	      System.out.println("Prime numbers from 1 to " + val + " are :");
	      System.out.println(primeNumbers);
	      
	   }
	     
	}

