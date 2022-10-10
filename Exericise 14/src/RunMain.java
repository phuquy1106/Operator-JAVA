import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        int one;
        int two;
        int three;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        n = sc.nextInt();
        one = n/100;
        n = n%100;
        two = n/10;
        three =n%10;

        sum = one+two+three;

        System.out.println("reslut: "+sum);
    }
}
