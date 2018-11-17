import java.util.Scanner;

public class functionDetermination {

    public static double[] functionValue(int kValue, int nValue) {
        /*
         * This function is used for calculating the values of o_n for the 
         * given function: (1 - (1)/(1 +SUM_1_n((o_i)/(1 - o_i)))). 
         * Values given are as follows:
         *     o_1 = 0.5, for i = 1
         *     o_1_k = 0.9, for 1 < i < kValue
         *     o_k_n = 0.1, for kValue <= i <= nValue
         *
         * The function parameters are:
         *     INPUT:
         *         kValue - type INTEGER
         *         nValue - type INTEGER
         *     OUTPUT:
         *         outputValues - type DOUBLE[]
         */

        double[] outputValues = new double[nValue];
        double o_1 = (0.5)/(1 - 0.5);
        double o_1_k = (0.9)/(1 - 0.9);
        double o_k_n = (0.1)/(1 - 0.1);

        double funcSum = o_1;
        //System.out.println("f(o1): "+(1 - (1)/(1 + funcSum)));
        outputValues[0] = (1 - (1)/(1 + funcSum));
        
        for (int i = 2; i < kValue; i++) {
        
            funcSum += o_1_k;
            //System.out.println("f(o"+i+"): "+(1 - (1)/(1 + funcSum)));
            outputValues[i-1] = (1 - (1)/(1 + funcSum));
        }

        for (int i = kValue; i <= nValue; i++) {
        
            funcSum += o_k_n;
            //System.out.println("f(o"+i+"): "+(1 - (1)/(1 + funcSum)));
            outputValues[i-1] = (1 - (1)/(1 + funcSum));
        }

        return outputValues;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter integer kValue (GREATER THAN 1): ");
        int kValue = scanner.nextInt();
        
        System.out.print("Enter integer nValue (GREATER THAN 1): ");
        int nValue = scanner.nextInt();
        
        // Checking whether kValue is greater than nValue. If yes, then 
        // ask for kValue less than nValue
        while (kValue > nValue | kValue <= 1 | nValue <= 1) {

            System.out.println("Please enter kValue less than nValue, kValue > 1 and nValue > 1");

            System.out.print("Re-enter integer kValue: ");
            kValue = scanner.nextInt();
        
            System.out.print("Re-enter integer nValue: ");
            nValue = scanner.nextInt();
        }

        double[] result = functionValue(kValue, nValue);
        
        // Printing the values to console
        for (int i = 0; i < nValue; i++) {

            System.out.println("f(o"+(i+1)+"): "+result[i]);
        }
    }
}
