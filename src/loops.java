import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
        // int i = 1;
        // while (i<=5){
        //     System.out.println("*");
        //     i++;
       /* int i =100;
        while(i<=200){
            System.out.println(i);
            i++;*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int n = sc.nextInt();
        int a = 1;
        int sum;
        int b=0;
        while (a <= n) {
            b = a + b;
            a = a + 1;
        }
        System.out.println(b);
    }
}