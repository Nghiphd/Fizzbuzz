public class asda {
    public static void main(String args[]) {
        int fizz = 1;
        asda hw = new asda();
        hw.fuzz(1, 1);
    }
    public void fuzz(int x, int y) {
        int i = 0;
        y = 0;
        for(x = 0; x <= 100; x = (x+1)*3) {
            System.out.println("fizz");
        }
    }
}
