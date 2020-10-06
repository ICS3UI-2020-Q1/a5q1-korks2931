import java.util.Scanner;
/**
 *This program will create a multiplication table for the entered number. 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in); 

    // ask the user to enter an integer
    System.out.println (" Please enter an integer to create a multiplication table for");
    // prompt the user for the integer
    int integerUser = input.nextInt(); 
    // declare a variable to store result
    int result;
    // create a loop for that creates the multiplication table 
    for( int i = 1; i <= 12 ; i++){
      
     result = i * integerUser;
     // print out the multiplication table 
    System.out.println(i + " x " + integerUser + " = " + result );
      
    }
    
  }
}

