import java.util.*;
import java.io.*;

public class RosterGenerator{
    private static Player[] roster;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        generateTeam();
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
            int userJersey = -1;
            int userRating = -1;
            while(userJersey < 0 || userJersey > 99){
                System.out.println("Enter player " + (i+1) + "'s jersey number:");
                userJersey = scan.nextInt();
                if(userJersey < 0 || userJersey > 99){
                    System.out.println("Invalid jersey number. Please try again.");
                }
            }
            while(userRating < 1 || userRating > 9){
                System.out.println("Enter player " + (i+1) + "'s rating:");
                userRating = scan.nextInt();
                if(userRating < 1 || userRating > 9){
                    System.out.println("Invalid player rating. Please try again.");
                }
                System.out.println("");
            }
            Player p = new Player(userJersey, userRating);
            roster[i] = p;
        }


    }
}
