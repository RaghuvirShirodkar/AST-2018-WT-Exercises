import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.*;

public class Part_2_Doubles {

	public static void main(String[] args) {
		get_integers_from_users();
	}
	
	public static void get_integers_from_users()
		{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number_1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int number_2 = scan.nextInt();
		System.out.println("Enter third number: ");
		int number_3 = scan.nextInt();
		Random random_number = new Random();
		double[] random_number_array = new double[number_1];
		if (number_1>1 && number_1<1000000 && number_2<number_3)
			{
			for (int iteration_counter = 1 ; iteration_counter<number_1 ; iteration_counter++)
			{
				random_number_array[iteration_counter] = random_number.nextDouble()*1000;
			}
			}
		else
			{
			System.out.println("The conditions are not satisfied");	
		}
		scan.close();
		sum_number(random_number_array);
//		System.out.println("Sum is: " + sum);
		product_number(random_number_array);
//		System.out.println("Product is: "+product);
		average_number(random_number_array);
//		System.out.println("Average value is: " + average);
		max_number(random_number_array);
//		System.out.println("Max value is: " + max);
		min_number(random_number_array);
//		System.out.println("Min value is: " + min);
		variance_number(random_number_array);
//		System.out.println("Variance is: "+var);
	}
	
	public static double sum_number(double[] in)
		{
			double[] number_list = in;
			double sum = DoubleStream.of(number_list).sum();
			System.out.println("The sum is " + sum);
			return sum;
		}
	
	public static double product_number(double[] in)
		{
			double[] number_list = in;
			double product = 1;
			for(int iteration_counter = 1;iteration_counter<number_list.length;iteration_counter++)
			{
				product = product*number_list[iteration_counter];
			}
			System.out.println("The product is " + product);	
			return product;
		}
	
	public static double average_number(double[] in)
	{
			double[] number_list = in;
			int length = number_list.length;
			double average = (DoubleStream.of(number_list).sum())/length;
			System.out.println("The average is " + average);
			return average;
	}
	
	public static double max_number(double[] in)
	{
			double[] number_list = in;
			double max = number_list[0];
			for(int iteration_counter = 0; iteration_counter<number_list.length; iteration_counter++)
			{
				if(number_list[iteration_counter]>max)
				{
					max = number_list[iteration_counter];
				}
			}
			System.out.println("The max value is " + max);
			return max;
	}
	
	public static double min_number(double[] in)
	{	
		double[] number_list = in;
		double min = number_list[1];
		for(int iteration_counter = 1; iteration_counter<number_list.length; iteration_counter++)
		{
			if(number_list[iteration_counter]<min)
			{
				min = number_list[iteration_counter];
			}
		}
		System.out.println("The min value is " + min);
		return min;
	}
	
	public static double variance_number(double[] in)
	{	
        double sumofsquare =0;
        double variance;
        double[] number_list = in ;
        double sum = (DoubleStream.of(number_list).sum());
        for (int iteration_counter =0 ; iteration_counter<number_list.length; iteration_counter++)
        {
        	sumofsquare += (number_list[iteration_counter] * number_list[iteration_counter]);
        }
        variance = ((sumofsquare/number_list.length)- (sum*sum)/(number_list.length*number_list.length));	
        System.out.println("The variance is " + variance);
        return variance; 
        }
}


