//**


import java.util.Scanner;

public class seminar5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // int res = 1;
        // for (int i = 1; i <= b; i++) {
        //     res *= a;
        // }
        // System.out.println(res);

        // int c = pow(a, b);
        // System.out.println(c);
        double c = Math.pow(a, b);
        System.out.println(c);
    }

    // public static int pow(int a, int b) {
    //     if (b == 1) {
    //         return a;
    //     } else {
    //         return a * pow(a, b - 1);
    //     }
    // }
}
