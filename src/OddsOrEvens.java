import java.util.*;

public class OddsOrEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INTRO
        //take users name and if they are odds or evens

        System.out.println("Let's play a game called \"Odds and Evens\".");
        System.out.print("What is your name? ");
        String name = "";
        name += input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();

        if (choice.equals("O") || choice.equals("o")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
            choice = "odds";
        }
        else {
            System.out.println(name + " has picked evens! The computer will be odds.");
            choice = "evens";
        }

        System.out.println("------------------------------");
        System.out.println();


        //RANDOMISER
        //takes in the number of "fingers" the user will play
        // and then uses random generator to give the computer a play value

        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        Random random = new Random();
        int computer = random.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");

        System.out.println("------------------------------");
        System.out.println();


        //SUM
        //adds the two integers together and produces the sum
        int total_fingers = computer + fingers;
        System.out.println(fingers + " + " + computer + " = " + (total_fingers));


        //WHO WINS
        //decides if final answers is odd or even, and declares the winner

        if (total_fingers % 2 == 0) {
            System.out.println(total_fingers + " is ...even!");
            if (choice.equals("evens")) {
                System.out.println("That means " + name + " wins!");
            }
            else {
                System.out.println("That means the computer wins!");
            }
        }

        else {
            System.out.println(total_fingers + " is ...odd!");
            if (choice.equals("odds")) {
                System.out.println("That means " + name + " wins!");
            }
            else {
                System.out.println("That means the computer wins!");
            }
        }

        System.out.println("------------------------------");
        System.out.println();
    }
}
