/**
 * Lab07a-3
 * @author Eylul Badem
 * @version 13.12.2020
*/ 
public class TestDie 
{
    public static void main(String[]args) {
        
        // properties
        
        Die firstDie;
        Die secondDie;
        
        // constructors
        
        // 1-Create "Die" objects
        firstDie = new Die();
        secondDie = new Die();

        // program
        
        // 2-Use the roll method to bring random values on the top of the dice
        firstDie.roll();
        secondDie.roll();

        // 3-Print out the result using getFaveValue method
        System.out.println( "Die 1: "+  firstDie.getFaceValue());
        System.out.println( "Die 2: "+  secondDie.getFaceValue());
    }
}