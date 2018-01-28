/*  File:     MyStandardIO.Java
 *  Auhor:    Matthew Dwyer
 *  Date:     19 Jan 2018
 *  Purpose:  Pactice input out put skills
 */
import java.util.*; //  Invoke java.util library which contains the scanner
/**
 *  The following class will ask the usere a seires of questions, scan the user input
 *  an save the inputs as variables
 *  Then, it will echo all the information back to the user
 */
public class IfThenTests {
  public static void main(String[] args) {
    // Variable decleration
    byte uage=0; // variable for the users name
    float ucoordinatesLat = 0; // Variable for the users latitude
    float ucoordinatesLon = 0; // Variable for the users logitude
    float ustarnum =0; // Variable for the aprox stars in the useres galaxy
    long umaxshort=0; // Variable for the max value of the Java variable type "short"
    boolean ustress=true; // Variable for the true false question
    char infinity='\u221E';

    Scanner scannerIn = new Scanner(System.in); //  Connect input to the variable "scannerIn"
    /*
     *  The following block of code goes throug a cycle of prompting a user for input
     *  then stores the users input in the specified variable after the prompt
     */
    System.out.print("\nWhat is you age? :>");  //  Prompt the user to input age
    uage = scannerIn.nextByte();  //  Store the users input as the varable "uage"
    System.out.print("What is you latitued and logitude (hit enter after each entry)\n:>");
    ucoordinatesLat = scannerIn.nextFloat();
    System.out.print(":>");
    ucoordinatesLon = scannerIn.nextFloat();
    System.out.print("Approximately how may stars are in your galaxy? :>");
    ustarnum = scannerIn.nextFloat();
    System.out.print("What is the max value Java can store as a short? :>");
    umaxshort = scannerIn.nextLong();
    System.out.print("You are stress out True or False? :>");
    ustress = scannerIn.nextBoolean();
    /*
     *  The following block of code echos the information that was input above back to the user
     */
    System.out.println("\n"  + infinity);
    System.out.println("Your age is: " + uage);
    System.out.println("Your latitude and longitude are: " + ucoordinatesLat + " " + ucoordinatesLon);
    System.out.println("There are approximately " + ustarnum + " stars in your galaxy");
    System.out.println("The max value Java can store as a short is: " + umaxshort);
      if(ustress) {
        System.out.println("You are stress out relax");
      }
      else{
        System.out.println("You are not stressed, stay cool");
      }
    //System.out.println("It is " + ustress +" that you are stressed");
    System.out.println(infinity + "\n");
  }// end method main
}// end class MyStandardIO
