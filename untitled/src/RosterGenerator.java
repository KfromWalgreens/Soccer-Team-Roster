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
        while(!(scan.next().equals("q"))){
            if(scan.next().equals("o")){
                outputRoster();
            }else if(scan.next().equals("u")){
                updatePlayer();
            }else if(scan.next().equals("a")){
                outputRosterAboveRating();
            }
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println();
            System.out.println("Choose an option:");
        }
        System.exit(0);
    }

    //    public void replacePlayer(){
//
//    }
//
    public static void outputRosterAboveRating(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a rating:");
        int rate = scan.nextInt();
        System.out.println("ABOVE " + rate);
        for(int w = 0; w < 5; w++){
            if(roster[w].getPlayerRanking() > rate){
               System.out.println("Jersey number: " + roster[w].getPlayerJerseyNumber() + ", Rating: " + roster[w].getPlayerRanking());
            }
        }
        System.out.println("");
    }

    public static void updatePlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a jersey number:");
        int number = sc.nextInt();
        System.out.println("Enter a new rating for player:");
        int rating = sc.nextInt();
        for(int y = 0; y < 5; y++){
            if(number == roster[y].getPlayerJerseyNumber()){
                roster[y].setPlayerRanking(rating);
            }
        }
        System.out.println("");
    }

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

    public static void outputRoster(){
        System.out.println("ROSTER");
        for(int j = 0; j < 5; j++){
            System.out.println(roster[j].toString());
        }
        System.out.println("");
    }

}