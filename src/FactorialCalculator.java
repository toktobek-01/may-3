public class FactorialCalculator {

        // default access method (no modifier)
        int factorial(int n) {
            if (n == 0 || n == 1)
                return 1; // base case
            else
                return n * factorial(n - 1); // recursive call
        }

        public static void main(String[] args) {
            FactorialCalculator calc = new FactorialCalculator();

            int number = 5;
            int result = calc.factorial(number);

            System.out.println("Factorial of " + number + " is: " + result);
        }
    }


