/**
 * Lab07a-5
 * @author Eylul Badem
 * @version 13.12.2020
*/ 
public class TestDiceGame 
{
    // Have a methos play that rolls the dice until both dies have 6 on top and return the count of tries it took
    public static int play( Dice firstDie, Dice secondDie)
    {
        // constructors
        
        firstDie = new Dice();
        secondDie = new Dice();
    
        // program code
        
        int total = 0;
        int count = 0;
        
        while ( total != 12 )
           {          
                firstDie.roll1();
                secondDie.roll2();
        
                int value1 = firstDie.getDie1FaceValue();
                int value2 = secondDie.getDie2FaceValue();
                total = value1 + value2;
                
                count = count + 1;
           }
        return count;
    }
    
    public static void main(String[]args) {

        // properties
        
        Dice firstDie; 
        Dice secondDie;
        
        // constructors
        
        firstDie = new Dice();
        secondDie = new Dice();
        
        // program code
        
        // 1-Use the play method to sum up the values of the dice and returns the count of tries it took to get 12
        int result = play( firstDie, secondDie);
        
        // 2-Print out the count of tries it took to get 12
        System.out.print( "It took " + result + " tries to find 6-6");
    }

}