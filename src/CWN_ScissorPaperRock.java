import java.util.Scanner;
import java.util.Random;
public class CWN_ScissorPaperRock {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rocks 1 for paper and 2 for scissors");
        System.out.println("Its your turn");
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int human = sc.nextInt(3);
        if (human==0) {
            System.out.println("You have chosen Rock");
        }
        else if (human ==1) {
            System.out.println("You have chosen Paper");
        }
        else{
            System.out.println("You have chosen Scissors");
        }
        int computer = rc.nextInt(3);
        if (computer==0) {
            System.out.println("Computer has chosen Rock");
        }
        else if (computer ==1) {
            System.out.println("Computer has chosen Paper");
        }
        else{
            System.out.println("Computer has chosen Scissors");
        }
        if (human==0 && computer==2 || human ==1 && computer == 0 || human==2 && computer == 1){
            System.out.println(" ");
            System.out.println("Congratulations you have won");
        }
        else if (computer == 0 && human ==2 || computer == 1 && human == 0 || computer==2 && human == 1){
            System.out.println(" ");
            System.out.println("You Are a Donkey");
        }
        else{
            System.out.println(" ");
            System.out.println("It is draw");
        }
    }
}
