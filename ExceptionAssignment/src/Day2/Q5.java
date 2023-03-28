package Day2;

import java.io.IOException;

public class Q5 {


    public static void main(String[] args) {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    private static void method1() throws IOException {
        method2();
    }

    private static void method2() throws IOException {
        method3();
    }

    private static void method3() throws IOException {
        throw new IOException("Checked exception thrown from method3");
    }
}
