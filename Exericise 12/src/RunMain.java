import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        int first;
        int second;
        int third;
        int forth;
        int sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        n = sc.nextInt();

        first = n/10000;
        n = n%10000;
        second = n/1000;
        n = n%1000;
        third = n/100;
        n = n%100;
        forth = n/10;

        sum = first + forth;

        System.out.println("Sum : "+sum);
    }
}
