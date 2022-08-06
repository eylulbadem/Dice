
/**
 * Lab07a-5
 * @author Eylul Badem
 * @version 13.12.2020
*/ 

public class DiceGame 
{
    // Have a play method which sums up the values of the dice and returns the count of tries it took to get 12
    public static int play( Dice firstDie, Dice secondDie)
    {
        firstDie = new Dice();
        secondDie = new Dice();
    
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
    
}
