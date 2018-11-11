import java.util.Scanner;

public class piApproximation {
    
    public static double getCircumference(int diameter, int pi_precision) {

        /* Compute circumference for the given precision of PI:
         * Method definition:
         *     Input:
         *         diameter - type INTEGER
         *         pi_precision - type INTEGER
         *     Output:
         *         circumference - type DOUBLE
         *     Local variables:
         *         pi_value - type DOUBLE 
        */

        double pi_value = (Math.floor(Math.PI * Math.pow(10, pi_precision)) / Math.pow(10, pi_precision));
        double circumference = pi_value * (double) diameter;
        System.out.format("Circumference with d %d for PI %f is %.15f\t", diameter, pi_value, circumference); 
        return circumference;
    }

    public static double getArea(int diameter, int pi_precision) {
        
        /* Compute area for the given precision of PI:
         * Method definition:
         *     Input:
         *         diameter - type INTEGER
         *         pi_precision - type INTEGER
         *     Output:
         *         area - type DOUBLE
         *     Local variables:
         *         pi_value - type DOUBLE 
        */

        double pi_value = (Math.floor(Math.PI * Math.pow(10, pi_precision)) / Math.pow(10, pi_precision));
        double area = pi_value * Math.pow((double) diameter, 2) / 4;
        System.out.format("Area with d %d for PI %f is %.15f\n", diameter, pi_value, area); 
        return area;
    }

    public static void main(String[] args) {
        
        /* Taking inputs from user:
         *     user_input - Diameter of circle.
         *     user_input_precision - Number of digits after decimal to be considered for PI.
        */

        System.out.println("========== USER INPUT ==========");
        System.out.println("Enter diameter of circle: ");
        Scanner scanner = new Scanner(System.in);
        int user_input = scanner.nextInt();

        System.out.println("Enter max precision of PI to be considered: ");
        int user_input_precision = scanner.nextInt();


        /* Checking value of user_input_precision:
         *     Math.PI has a double value, with 15 digits after the decimal place.
         *     If the value entered by user is greater than 15, then reset the value to 15.
        */

        if (user_input_precision > 15) {
            System.out.println("Precision input too big for Math.PI, resetting precision to 15.");
            user_input_precision = 15;
        }

        double[] area = new double[user_input_precision + 1];
        double[] circumference = new double[user_input_precision + 1];

        /* Calculating the circumference and area:
         *     getCircumference() - Compute circumference for given diameter and current precision value.
         *     getArea() - Compute area for given diameter and current precision value.
        */

        System.out.println("\n========== COMPUTING CIRCUMFERENCE AND AREA ==========");
        for (int current_precision = 0; current_precision <= user_input_precision; current_precision++) {
            circumference[current_precision] = (getCircumference(user_input, current_precision));
            area[current_precision] = (getArea(user_input, current_precision));
        }

        // Calculating the percentage increase in circumference and area:

        System.out.println("\n========== COMPUTING PERCENTAGE INCREASE ==========");
        for (int index = 1; index < area.length; index++) {
            System.out.format("Percentage increase in circumference: %.15f\tPercentage increase in area: %.15f\n", 
                                (circumference[index] - circumference[index-1]) / circumference[index-1],
                                (area[index] - area[index-1]) / area[index-1]);
        }
    }
}
