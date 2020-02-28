import java.util.*;
import java.io.*;

public class RosterGenerator{
    private static Player[] roster;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //prompts user to input team info
        generateTeam();
        //creates the menu
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");

        if(scan.nextLine().equals("q")){//if q is pressed, the program exits
            System.exit(0);
        }
    }

    //    public void replacePlayer(){
//
//    }
//
//    public void outputRosterAboveRating(){
//
//    }
//
//    public void updatePlayer(){
//
//    }
//
    public static void generateTeam(){
        Scanner scan = new Scanner(System.in);
        roster = new Player[5];
        int[] allJerseys = new int[5];
        for(int i = 0; i < 5; i++){
            //initializes the following variables to -1 so that the while loops can start
            int userJersey = -1;
            int userRating = -1;
            while(userJersey < 0 || userJersey > 99){
                System.out.println("Enter player " + (i+1) + "'s jersey number:");
                userJersey = scan.nextInt();
                //checks to see if the user's inputted jersey number falls between the range
                if(userJersey < 0 || userJersey > 99){
                    System.out.println("Invalid jersey number. Please try again.");
                }
            }
            while(userRating < 1 || userRating > 9){
                System.out.println("Enter player " + (i+1) + "'s rating:");
                userRating = scan.nextInt();
                //checks to see if the user's inputted rating falls between the range
                if(userRating < 1 || userRating > 9){
                    System.out.println("Invalid player rating. Please try again.");
                }
                System.out.println("");
            }
            //creates a new Player object when the checking process is done
            Player p = new Player(userJersey, userRating);
            //puts the new Player object into the roster array
            roster[i] = p;
        }


    }
}