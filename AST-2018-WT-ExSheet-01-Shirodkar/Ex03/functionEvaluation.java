public class functionEvaluation {
    
    public static void functions(int input) {

        /* Calculate all functions and print them in a tabular manner
         * Method definition:
         * 	Input:
         *          user input, type INTEGER
         * 	Output:
         *          VOID
         * 	Local variables:
         *          functionResult1 - INTEGER
         * 	    functionResult2 - FLOAT
         * 	    functionResult3 - DOUBLE
         * 	    functionResult4 - INTEGER
         * 	    functionResult5 - FLOAT
         * 	    functionResult6 - DOUBLE
         */
    	
        // f(n) = 2n

        int functionResult1 = 2*input;

        // f(n) = n^0.5

        float functionResult2 = (float) Math.pow(input, 0.5);

        // f(n) = 10^n

        double functionResult3 = Math.pow(10, input);

        // f(n) = n^3

        int functionResult4 = (int) Math.pow(input, 3);

        // f(n) = 2^(1/n)

        float functionResult5;
        if (input != 0) {
            functionResult5 = (float) Math.pow(2, (1/(float) input));
        }
        else {
        	functionResult5 = Float.POSITIVE_INFINITY;
        }
     
        // f(n) = e^n

        double functionResult6 = Math.pow(Math.E, input);

        System.out.format("%d \t %d \t %.2f \t %.0f \t %d \t %.6f \t %.2f" ,
       			   input, functionResult1, functionResult2, functionResult3, 
       			   functionResult4, functionResult5, functionResult6);

    }

    public static void main(String[] args) {
        
        // Header

    	System.out.println("n \t f(n) = 2n\tf(n) = n^0.5\tf(n) = 10^n\tf(n) = n^3\t"
	 		 + "f(n) = 2^(1/n)\tf(n) = e^n");
        
    	// Iterating over [0, 100]

    	for (int n = 0; n <= 100; n++ ) {
            functions(n);
            System.out.println();
        }    
    }
}
