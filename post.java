/*  File:     post.Java
 *  Auhor:    Matthew Dwyer
 *  Date:     19 Jan 2018
 *  Purpose:  find the bug
 */
import java.util.*; //  Invoke java.util library which contains the scanner
/**
 *  The following class will ask the user a question, scan the user input
 *  save the input as a variable make analyize the user's input
 *  Then, it will echo  the information back to the user
 */
public class post {
  public static void main(String[] args) {
    // Variable decleration
    boolean ustress=true; // Variable for the true false question

    Scanner scannerIn = new Scanner(System.in); //  Connect input to the variable "scannerIn"
    /*
     *  The following block of code ask the user a question requiereing a true or false answer
     *  Then it checks weather the answere is true or false and ehoes the input back to the user
     */
    System.out.print("You are stress out, True or False? :>");
    ustress = scannerIn.nextBoolean();
    /*
     *  The following block of code echos the information that was input above back to the user
     */
    if(ustress) {
      System.out.println("You are stress out relax!");
      }
    else{
      System.out.println("You are not stressed, stay cool");
      }
  }// end method main
}// end class post
