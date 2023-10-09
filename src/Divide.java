public class Divide {
    public static void main(String[] args) {
         double dividend = 50.0;
         double divisor = 3.0;

        double result = dividend / divisor;

         int integerResult = (int) result;

        System.out.println("The result of " + dividend + " / " + divisor + " as an integer is: " + integerResult);
    }  {
        System.out.println("Error: Division by zero is not allowed.");
        }
    }
