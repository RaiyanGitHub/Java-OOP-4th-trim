package javaprobse2;

/**
 *
 * @author ریان
 */
import java.util.Scanner;
public class Chain_average {
    
    public void chain_average$$product(){
        double average = 0.0;
        int iteration = 0, product = 1;
        int map;
        String exitClause = "m";// just a value which does not match 'q'.
        do{
        System.out.print("Enter an integer that you want to be included in the average: ");
        Scanner Uzah = new Scanner(System.in);
        map = Uzah.nextInt();
        average += map;
        iteration++;
        product *= map;
        System.out.println("Do you want to exit? if so  press \'q\' else,"
                + " press any other key (please don\'t press the power key !"
                + " or any other command keys for that matter! )");
        exitClause = Uzah.next();
        }while(!("q".equalsIgnoreCase(exitClause)));
        if(!(iteration % average == 0))
            average /= iteration;
        else
            average /= (double)iteration;
        System.out.println("Average of the numbers is: " + average + 
                " while the product of the numbers are: " + product);
        
    
    }
    
}
