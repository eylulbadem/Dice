import java.util.Random;

/**
 * Lab07a-3 
 * @author Eylul Badem
 * @version 13.12.2020
*/ 

public class Die {

    // properties
    
    private int value;

    // methods
    
    // Have a method to create the value above the die
    public void setValue( int diceValue) {
           value = diceValue;
    }

    // Have a method to return the current face value of the die
    public int getFaceValue() {
           return value;
    }

    // Have a method that generates a new, random value for the die and also returns it
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt( 6) + 1;
    }
    
    public String toString() {
        return value + "";
    }
}
