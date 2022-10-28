public class Fizzbuzz {
    public static void main(String args[]) {
        int i;
        for(i = 1; i < 101; i++) {
            if (i/15 * 15 == i) {
                System.out.println ("FizzBuzz");
            }
            else if (i*3/3 == i) {
                System.out.println("Fizz");
            }
            else if (i/5 * 5 == i) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
