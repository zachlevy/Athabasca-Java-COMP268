/*
 * 14. The coin-counting program in the study guide targets Canadian money.
Modify and implement the program to count coins from a different country of
your choice outside of North America.
 */

package midtermquiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zacharylevy
 * @version 20140707
 */
public class CoinCounter {
    // instance vars
    ArrayList<Coin> wallet = new ArrayList<Coin>();
    Scanner in = new Scanner(System.in);
    
    // constructor
    public CoinCounter () {
        // add all the difference coin type for the British Pound
        wallet.add(new Coin("One Penny", 1));
        wallet.add(new Coin("Two Pence", 2));
        wallet.add(new Coin("Five Pence", 5));
        wallet.add(new Coin("Ten Pence", 10));
        wallet.add(new Coin("Twenty Pence", 20));
        wallet.add(new Coin("Fifty Pence", 50));
        wallet.add(new Coin("One Pound", 100));
        wallet.add(new Coin("Two Pounds", 200));

        // accept input from the user
        boolean prompt = true;
        while (prompt) {
            System.out.println("Enter the value of the coin you want to add to your wallet. Type \"Stop\" to stop.");
            String input = in.nextLine();
            if (input.equals("stop")) {
                prompt = false;
                checkBalance();
            } else {
                getPaid(Integer.parseInt(input));
            }
        }
    }
    
    // add a coin to your wallet
    public void getPaid (int input) {
        for (Coin coinType : wallet) {
            if (coinType.value == input) {
                coinType.addCoin();
            }
        }
    }
    
    // check the balance of your wallet
    public void checkBalance () {
        for (Coin coinType : wallet) {
            coinType.coinCount();
        }
    }
    
    // class for a coin
    // give it a name and a value
    private class Coin {
        // instance vars
        public String name;
        public int value;
        public int count;
        
        // constructor
        Coin (String startName, int startValue) {
            name = startName;
            value = startValue;
            count = 0;
        }
        
        // print out the how many of the coin you have
        public void coinCount (){
            System.out.println("You have " + count + name + " coins.");
        }
        
        // add a coin to your stack and print out how many you have now
        public void addCoin () {
            ++count;
            System.out.println("You now have " + count + name + " coins.");
        }
    }
    
}
