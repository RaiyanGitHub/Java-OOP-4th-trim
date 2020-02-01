
package javaprobse2;

/**
 *
 * @author سعدي
 */
import java.util.Scanner;
public class Factorial {
    long id;
    public void user_input(){
        
        Scanner Uzah = new Scanner(System.in);
        // This question was included to see whether the user input needs long data type or not
        System.out.println("Is your number bigger than 2^32? (y/n) ");
        
        
        
        String option = Uzah.next();
        System.out.println("Enter the number whose factorial you want: ");
        
        if("y".equalsIgnoreCase(option)){
        long Num1 = Uzah.nextLong();
        System.out.println("The factorial of "+Num1+" is: "+factorial(Num1));
        }else{
        int  Num1 = Uzah.nextInt();
        System.out.println("The factorial of "+Num1+" is: "+factorial(Num1));
        }// end of if-else block
        
        
    }// end of user input method
    public long factorial(long l){
        if(l==0)
            return 1;
        else
            return factorial(l-1)*l;
    }
    public int factorial(int l){
        if(l==0)
            return 1;
        else
            return factorial(l-1)*l;
    }
}
