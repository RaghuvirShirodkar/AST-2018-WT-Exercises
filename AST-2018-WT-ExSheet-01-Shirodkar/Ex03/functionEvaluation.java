public class functionEvaluation {
  
        /* DESCRIPTION:
         * Calculate respective functions and print them in a tabular manner
         * Method definition:
         * 	Input:
         *          user input, type INTEGER
         * 	Output:
         *          DATA_TYPE
         * 	Local variables:
         * 	    functionResultx - DATA_TYPE
         */
  
    public static int functionType1(int input) {

        // f(n) = 2n

        int functionResult1 = 2*input;
        return functionResult1;
    }

    public static float functionType2(int input) {

        // f(n) = n^0.5

        float functionResult2 = (float) Math.pow(input, 0.5);
        return functionResult2;
    }

    public static double functionType3(int input) {

        // f(n) = 10^n

        double functionResult3 = Math.pow(10, input);
        return functionResult3;
    }

    public static int functionType4(int input) {

        // f(n) = n^3

        int functionResult4 = (int) Math.pow(input, 3);
        return functionResult4;
    }

    public static float functionType5(int input) {

        // f(n) = 2^(1/n)

        float functionResult5;
        if (input != 0) {
            functionResult5 = (float) Math.pow(2, (1/(float) input));
        }
        else {
     	    functionResult5 = Float.POSITIVE_INFINITY;
        }
        return functionResult5;
    }
     
    public static double functionType6(int input) {

        // f(n) = e^n

        double functionResult6 = Math.pow(Math.E, input);
        return functionResult6;
    }

    public static void main(String[] args) {
        
        // Header

    	System.out.format("%3s| %14s| %16s| %103s|  %4s|     %s|    %55s|\n" ,
    					  'n', "f(n) = 2n", "f(n) = n^0.5", "f(n) = 10^n", 
    					  "f(n) = n^3", "f(n) = 2^(1/n)", "f(n) = e^n");
        
    	// Iterating over [0, 100]

    	for (int n = 0; n <= 100; n++ ) {

            System.out.format("%3d \t %10d \t %12.2f \t %101.0f \t %10d \t %14.6f \t %50.2f\n" ,
        		       n, functionType1(n), functionType2(n), functionType3(n), 
       			       functionType4(n), functionType5(n), functionType6(n));
        }    
    }
}