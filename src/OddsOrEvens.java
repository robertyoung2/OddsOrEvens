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
        }
        else {
            System.out.println(name + " has picked evens! The computer will be odds.");
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


        //WHO WINS
        //decides if final answers is odd or even, and declares the winner

//        if (user is odd and sum is odd) {
//            user wins
//        }
//        else if(user is odd and sum is even){
//            user loses
//        }
    }

}
