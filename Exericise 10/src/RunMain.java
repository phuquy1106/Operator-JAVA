public class RunMain {
    public static void main(String[] args) {
        int a =6;
        int b =8;
        int c;
//  cách 1: sử dụng biến thứ 3
        c=a;
        a=b;
        b=c;
        System.out.println("swap: ");
        System.out.printf("a = %d\n = %d\n",a,b);
// cách 2: không sử dụng biến thứ 3
        a = a+b;
        b = a-b;
        a = a -b;
        System.out.printf("a = %d\n = %d\n",a,b);
    }
}
