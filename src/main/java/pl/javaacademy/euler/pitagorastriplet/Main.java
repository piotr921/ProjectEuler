package pl.javaacademy.euler.pitagorastriplet;

public class Main {

    public static void main(String[] args) {
        int limit = 1000;
        int a, b, c = 0;

        //  loop from 2 to max_limitit
        int m = 2;

        while (c < limit) {
            // now loop on j from 1 to i-1
            for (int n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;

                if (a + b + c == 1000) {
                    System.out.println(a + "; " + b + "; " + c);
                    System.out.println("Product = " + a * b * c);
                    break;
                }
            }
            m++;
        }
    }
}
