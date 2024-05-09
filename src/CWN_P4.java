import java.util.Scanner;
public class CWN_P4 {
    public static void main(String[] args) {
        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Percentage in Physics");
        float a = sc.nextFloat();
        System.out.println("Enter your Percentage in Chemistry");
        float b = sc.nextFloat();
        System.out.println("Enter your Percentage in Mathematics");
        float c = sc.nextFloat();
        float d = (a+b+c)/300*100;
        if (a>=33 && b>=33 && c>=33) {
            if (d >= 40) {
                System.out.println("You have Passed the Examination");
            }
            else {
                System.out.println("You have Failed the Examination");
            }}
            else{
                System.out.println("You have Failed the Examination");
            }

        System.out.println("Please enter your salary");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if(a<250000){
            System.out.println("You don't have to pay any income tax!");
        }
        else if (a>=250000 && a<500000){
            a=5/100.0f*a;
            System.out.println("Your income tax is "+a);
        }
        else if (a>=500000 && a<1000000){
            a=20/100.0f*a;
            System.out.println("Your income tax is "+a);
        }
        else {
            a=30/100.0f*a;
            System.out.println("Your income tax is "+a);
        }

        System.out.println("Please enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Sunday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            case 5:
                System.out.println("The day is Thursday");
                break;
            case 6:
                System.out.println("The day is Friday");
                break;
            case 7:
                System.out.println("The day is Saturday");
                break;

         */
        System.out.println("Please enter the year you want to check");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%4;
        if (b==0){
            System.out.println("The year is leap year!");
        }
        else{
            System.out.println("The year is not leap year!");
        }
        }
    }
