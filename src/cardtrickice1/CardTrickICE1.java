/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.*;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Card[] magicHand = new Card[7]; //Array of object
        Card luckyCard = new Card(4,"diamonds"); //Added object from github
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card((int)((Math.random()*13) + 1),Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]= c1;
        }
        
        for(Card card : magicHand){
            System.out.println(card);
        }
        //step 2:take input 
        System.out.print("Please chose the suit: \n1: Hearts\n2: Diamonds"
            + "\n3: Spades\n4: Clubs\nSuit:");
        Scanner input=new Scanner(System.in);
        String inp=input.next();
        
        System.out.println("Please choose the value(1 to 13):");
        int userInp = input.nextInt();
        
        String switchedSuit;
        switch(inp)
        {
            case "1":
                switchedSuit = Card.SUITS[0];
                break;
            case "2":
                switchedSuit = Card.SUITS[1];
                break;
            case "3":
                switchedSuit = Card.SUITS[2];
                break;
            case "4":
                switchedSuit = Card.SUITS[3];
                break;
            default:
                switchedSuit = "";
        }
        
        String finalValue = userInp + " of " + switchedSuit;
      
        //step 3: match with array 
        String output = "Card not found.";
        for(int i=0;i<magicHand.length;i++)
        {
            if(magicHand[i].toString().equals(finalValue))
                {
                    output = "Card is found.";
                    break;
                }
        }
        System.out.println(output);
    }
    
}