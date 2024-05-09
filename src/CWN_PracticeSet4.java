import java.util.Scanner;
public class CWN_PracticeSet4 {
    public static void main(String[] args) {
//        int n = 4;
//        for (int i=n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i>0; i--){
            for(int j=1; j<=i; j++) {
                sum =  2*j+sum;
            }
        }
        System.out.println("the sum of first "+n+" even number is "+sum);
    }
}
