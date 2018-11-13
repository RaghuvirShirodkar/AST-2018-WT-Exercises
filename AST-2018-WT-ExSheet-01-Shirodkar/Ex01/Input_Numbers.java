import java.util.Scanner;
public class Input_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter vaue of n between 1 to 100");
        int n = scan.nextInt();
        System.out.println("Enter " + "numbers");
        int numbers[] = new int[n];
        
        for (int iterator=0; iterator<n; iterator++)
        {
            numbers[iterator] = scan.nextInt();
        }
        Input_Numbers in = new Input_Numbers();
        int sum_n = in.sum_calc(numbers);
        int prod_n = in.prod_calc(numbers);
        int mean_n = in.mean_calc(numbers,sum_n);
        int max = in.max_calc(numbers);
        int min = in.min_calc(numbers);
        int variance = var_calc(numbers,sum_n);
        
        System.out.println("Sum :"+ sum_n);
        System.out.println("Product :"+ prod_n);
        System.out.println("Mean :" + mean_n);
        System.out.println("Maximum :" +max);
        System.out.println("Minimum :" + min);
        System.out.println("Variance :" + variance);   
    }
        
        public static int sum_calc(int ar[]) 
        {
        	int sum = 0;
        	int[] numbers = ar;
        	for (int i=0; i<numbers.length; i++)
            {
                sum = sum + numbers[i];
            }
        	return sum;
        }
        	
        public static int prod_calc(int ar[]) 
        {
        	int prod = 1;
        	int[] numbers = ar;
        	for (int j=0; j<numbers.length; j++)
            {
                prod = prod * numbers[j];
            }
        	return prod;
        }
        
        public static int mean_calc(int ar[], int sum) {
        	int mean = 0;
        	int sum_n = sum;
        	int numbers[] = ar;
        	mean = sum_n/numbers.length;
        	return mean;        	
        }
        
        
        public static int max_calc(int ar[]) {
        	int numbers[] = ar;
        	int smallest = numbers[0];
            int largest = numbers[0];
        	for (int i =1; i<numbers.length; i++)
            {
                if (numbers[i]>largest)
                    largest = numbers[i];
                else if (numbers[i]< smallest)
                    smallest = numbers[i];
            }
        	return largest;   	
        }
        
        public static int min_calc(int ar[]) {
        	int numbers[] = ar;
            int smallest = numbers[0];
            int largest = numbers[0];
        	for (int i =1; i<numbers.length; i++)
            {
                if (numbers[i]>largest)
                    largest = numbers[i];
                else if (numbers[i]< smallest)
                    smallest = numbers[i];
            }
        	return smallest;   	
        }
        
        public static int var_calc(int ar[], int sum1) 
        {
        	int sumofsquare =0, variance;
        	int sum = sum1;
        	int numbers[] = ar;
            for (int p=0;p<numbers.length; p++)
            {
                sumofsquare += (numbers[p] * numbers[p]);
            }
            variance = ((sumofsquare/numbers.length)- (sum*sum)/(numbers.length*numbers.length));	
            return variance;
        }
}
