import java.util.Random;
import java.util.Scanner;
public class DiceGame{

    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Hello, " + name);

        System.out.println("Rolling dice...");
        Random rand1 = new Random();
        Random rand2 = new Random();

        int dice1 = rand1.nextInt(6) + 1;
        int dice2 = rand2.nextInt(6) + 1;
        int sum = dice1 + dice2;

        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);


        System.out.println("Total value: " + sum);
        if(sum > 7){
            System.out.println(name + " won!");
        }
        else{
            System.out.println(name + " lost.");
        }

    }
}
