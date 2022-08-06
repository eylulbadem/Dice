/**
 * Lab07a 
 * @author Eylul Badem
 * @version 13.12.2020
*/ 
public class TestDice 
{
    public static void main(String[]args) {

        // properties
        
        // 1-Create "Die" objects
        Dice firstDie; 
        Dice secondDie;
        
        // constructors
        
        firstDie = new Dice();
        secondDie = new Dice();
        
        // program code
        
        // 2-Use the roll method to bring random values on the top of the dice
        firstDie.roll1();
        secondDie.roll2();
        
        // 3-Create new int variables with the values of dice using getFaceValue methods
        int value1 = firstDie.getDie1FaceValue();
        int value2 = secondDie.getDie2FaceValue();
        
        // 4-Sum up the values
        int total = value1 + value2;
        
        // 5-Print out the sum
        System.out.println("Dice: "+ total);

    }
}