import java.util.Scanner;
//9705133333
public class CWN_ps2 {
    public static void main(String[] args) {
        /*
             System.out.println(7/4.0f*9/2.0f);
          char grade = 'B';
          grade = (char)(grade + 8);
          System.out.println("The grade you told to your friend is "+grade);
          grade = (char)(grade-8);
          System.out.println("Your actual Grade was "+grade);

         char a;
         Scanner sc = new Scanner(System.in);
         a = sc.next().charAt(0);
          System.out.println("the charter that you have written is "+a);
          System.out.println("thank you");

        */
        System.out.println("Please enter Y if you are above 18 and N if you are under 18 years in age");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        switch(a) {
            case 'Y':
                System.out.println("You are an adult");
                break;
            case 'N':
                System.out.println("Your are a Child");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }
        System.out.println("Thanks for using my java code!");
    }
}
