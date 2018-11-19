import java.util.Scanner;
import java.util.concurrent.*;

public class Part_3_Integers
	{
	   public static void main (String[] args)
	   {        
		   
		   System.out.println("Enter a number");
		   Scanner scan = new Scanner(System.in);
		   int inp = scan.nextInt();
		   long time_elapsed = time_calculator(inp);
	       System.out.println("Time Elapsed is: "+time_elapsed + " ns");
	       System.out.println("Time elapsed (in ms) is: " + time_elapsed/1000000 + " ms");
	       System.out.println("Time elapsed (in s) is: " + time_elapsed/1000000000 + " s");
	       
	      //Empty String
	      
	   }
	   
	   public static void prime(int input) {
	      //System.out.println("Enter the value of n:");
		  
		  int val = input;
		  String  primeNumbers = "";
		  int iteration_counter =0;
		  int num =0;
		  if (val>0 && val<=99999)
		  {
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
		  else
		  {
			  System.out.println("Wrong Input");
		  }
	      
	   }	     
	   public static long time_calculator(int in)
	   {
		   long start_Time = System.nanoTime();
		   int inp = in;
		   prime(inp);
		   long end_Time = System.nanoTime(); 
		   long time_elapsed = end_Time - start_Time;
		   System.out.println(time_elapsed);
		   return time_elapsed;
	   }
	   }

