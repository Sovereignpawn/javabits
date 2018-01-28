/* File:     CesarOffset
 * Author:   Matthew Dwyer
 * Date:     25 January 2018
 * Purpose:  Encode strings of text
 */

/** This code will encipher a string input by a user.
 *  the cipher is a common Cesar cipher except each time a "e" is
 *  encountered in the string, the cipher will offset one letter to the right.
 *  The program begins for asking the user the enter a number. This number will be
 *  the offset number. (eg. If the user enters 2 then A=C B=D and so on) once the
 *  program encounters the first "e" the program will increase the offset by 1
 */
import java.util.*; // import the java utility library, this is needed for the scanner

public class CesarOffset{
  public static void main (String[] args) {
    int offsetNum =0;

    Scanner scannerIn = new Scanner(System.in);

    System.out.print("\n how much of an offset do you want? (0-25)");
    offestNum = scannerIn.nextInt();

    switch (offsetNum){
    case 0:

    }
  }
}
