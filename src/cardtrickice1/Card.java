/*
Name: Freya Bheda
Student ID: 991643368 
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "hearts","diamonds","spades","clubs"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
    
    //method for suits
    public Card(int value, String suits)
    {
        this.value=value;
        this.suits=suits;
    }
    @Override
    public String toString()
    {
        return value +" of "+ suits;
    }
}