package javaprobse2;
import java.util.Scanner;
/**
 *
 * @author سعدي
 */
public class JavaProbsE2 {

    public void ByGod_MyGod(){
        System.out.println("بسم الله الرحمن الرحیم");
    }
    public void Praise4TheLord(){
        System.out.println("الحمد لله رب العالمين ");
    }
    
    public static void main(String[] args) {
        JavaProbsE2 A = new JavaProbsE2();
        A.ByGod_MyGod();
       
        /** I am going to use only this main function for all the problems
         * so I will make the function seem a bit more soothing
         * Here goes problem 1:
         */
        System.out.println("/***\t\t      ***\\");
        System.out.println("/        Problem1        \\");
        Factorial problem1 = new Factorial();
        problem1.user_input();//this function does all
        
        
        
        
        /**
         *      Here goes problem 2: Continuous average and product 
         *      until 'q' is pressed.
         * 
         */
        System.out.println("/        Problem2        \\");
        Chain_average problem2 = new Chain_average();
        problem2.chain_average$$product();
         
        
         /**
          *         All well so far
          * 
          *         now for problem 3:Three child classes of one parent class.
          */
         System.out.println("/        Problem3        \\");
         Shape mother = new Shape();
         System.out.println(" \n\n\n(inside the shape's create function)");
         mother.create();
         for(double i=0.0; i<10000000000.0; i++);// to delay the program flow
         System.out.println(" (inside the shape's erase function)");
         mother.erase();
  
         Circle daughter = new Circle();
         Triangle sibling = new Triangle();
         Square another_sibling = new Square();
         
//       Shape family[] = [daughter,sibling, another_sibling];

        for(double i=0.0; i<10000000000.0; i++);// to make sure outputs are distinguishable
        System.out.println(" (inside the circle's create function)");
        daughter.create();
        System.out.println(" (inside the circle's erase function)");
        daughter.erase();
        
        for(double i=0.0; i<10000000000.0; i++);
        System.out.println(" (inside the triangle's create function)");
        sibling.create();
        System.out.println(" (inside the triangle's erase function)");
        sibling.erase();
        
        for(double i=0.0; i<10000000000.0; i++);
        System.out.println(" (inside the square's create function)");
        another_sibling.create();
        System.out.println(" (inside the square's erase function)");
        another_sibling.erase();
//      problem 3    Done # E:-*)
        
        /**Now problem 4:
         *  overload a function of the same class to print the area of a 
         *  rectangle in one case and to print the area of a square in the other.
         *  بسمه تعالی
         */
        
        System.out.println("\n\n\n\nProblem no.4: Program to calculate areas:");
        RectangleNsQuare twoFace = new RectangleNsQuare();
        
        System.out.print("Enter the side of the square: ");
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        twoFace.area(side);
        System.out.print("Enter the length and breadth of the rectangle successively: ");
        int length = input.nextInt();
        int breadth = input.nextInt();
        twoFace.area(length, breadth);
        
        
        /**
         * 
         * Problem 5: Reverse a string.
         */
        
        System.out.print("\n\n\t\tProblem 5: String Reversal-\n"
                + "Enter a string that you need reversed: ");
        String dummy_string = input.nextLine();// this catches the enter pressed in 
        String hail = input.nextLine();        //the last Scanner input
        Problem5 strObj = new Problem5();
        strObj.ReverseCard(hail);
        
        
        
        A.Praise4TheLord();

    }//end of main method
    
}
