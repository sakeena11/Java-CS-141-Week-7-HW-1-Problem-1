public class Function {
    public static int f(int n) {
        //TODO: complete this method
        if (n > 1 && n % 2 == 0) {
            return n + f(n - 1);
        } else if (n > 1 && n % 2 != 0) {
            return n * f(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        //optional main method if you want to use it to test your code
        //offline.  you do not need to complete it for this assignment
        //Mimir will test only the above method
    }
}
