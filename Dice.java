import java.util.Random;

/**
 * Lab07a-4
 * @author Eylul Badem
 * @version 13.12.2020
*/ 

public class Dice {

    // properties
    
    private int value1;
    private int value2;

    // methods
    
    // Have a method to create the values above the dice
    public void setDie2Value( int dice1Value) {
        value1 = dice1Value;
    }
    
    public void setDie1Value( int dice2Value) {
        value2 = dice2Value;
    }

    // Have a method to return the current face values of the dice
    public int getDie1FaceValue() {
        return value1;
    }
    
    public int getDie2FaceValue() {
        return value2;
    }
    
    // Have a method that adds up face values of dice and returns the result 
    public int getDiceTotal( Die firstDie, Die secondDie) {
        int diceTotal = value1 + value2;
        return diceTotal;
    }

    // Have a method that generates a new, random values for the dice and also returns it
    public void roll1() {
        Random rand = new Random();
        value1 = rand.nextInt(6) + 1;
    }
    
    public void roll2() {
        Random rand = new Random();
        value2 = rand.nextInt(6) + 1;
    }
    
    public String toString() {
        return value1 + "";
    }
}

 
