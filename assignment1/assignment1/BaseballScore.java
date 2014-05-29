
/**
 * Question 13
 * 
 * 13.	Write a program that reads the scores of nine innings
 * of a baseball game between two teams from console and decides
 * the winner. How would you extend the program to compute the
 * winners of N number of games between the two teams?
 * (No need to write a complete program for the extension part.)
 * 
 * To compute the winners of N number of games between the two teams
 * Create a class called BaseballSeries that contains an array of
 * BaseballScore instances. You would change the return value of
 * isWinner method to something more readable programmatically like
 * 0 for team A
 * 1 for team B
 * 2 for tie
 * 
 * Then you would count the number of 0 and 1 in the array and compare them
 * to see who won
 * 
 * 
 * 
 * 
 * This class takes in a input from the console (csv, no spaces) and
 * outputs text displaying of which team won the game. The input must
 * be 9 innings
 * 
 * @author Zachary Levy
 * @version 20140528
 */
import java.util.Scanner;
import java.util.Arrays;
public class BaseballScore
{
    // instance variables - replace the example below with your own
    private String[] teamAInnings;
    private String[] teamBInnings;
    private int teamAScore = 0;
    private int teamBScore = 0;
    
    Scanner in = new Scanner(System.in);
    /**
     * Constructor for objects of class BaseballScore
     */
    public BaseballScore()
    {
        setScores();
        // initialise instance variables
    }

    public void setScores () {
        // get an input of the console of csv scores, and place them into string array
        System.out.println("Please enter Team A's inning scores (csv, no spaces): ");
        String teamAInningsInput = in.nextLine();
        teamAInnings = teamAInningsInput.split(",");
        
        System.out.println("Please enter Team B's inning scores (csv, no spaces): ");
        String teamBInningsInput = in.nextLine();
        teamBInnings = teamBInningsInput.split(",");
        
                // sample outputs
        //teamAInnings = new String[]{1,2,3,7,3,7,3,1,4};
        //teamBInnings = new String[]{1,2,4,4,5,2,1,2,0};
        
        //teamAScore calculated
        for (int i = 0; i < teamAInnings.length; i++) {
            teamAScore =+ Integer.parseInt(teamAInnings[i]);
        }
        //teamBScore calculated
        for (int i = 0; i < teamBInnings.length; i++) {
            teamBScore =+ Integer.parseInt(teamBInnings[i]);
        }
    }
    
    // checks to see who won, if anyone
    public String isWinner () {
        // validation
        if (teamAInnings.length == 9 && teamBInnings.length == 9) {
            // return result of the game
            if (teamAScore > teamBScore) {
                return "Team A wins!";
            } else if (teamAScore < teamBScore) {
                return "Team B wins!";
            } else if (teamAScore == teamBScore) {
                return "Tie Game";
            } else {
                return "Referees fell asleep";
            }
        } else {
            return "The Game was not 9 innings";
        }
    }

}