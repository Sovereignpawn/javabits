

//import the input output library

import java.io.*;

// class to test the BufferedReader method to scan info in from user
public class IOtest
{

  public static void main (String [] args) throws IOException
  {
    // establish two variables a and b.  a is an integer and b is a double
    int a;
    double b;
    // primes the program to store whatever the user inputs as a variable called
    // "stdin"
    BufferedReader stdin = new BufferedReader
      (new InputStreamReader (System.in));
    //print a message to the screan asking for info
    System.out.print ("Type the value of a (integer):>");
    //store the user input which is stdin as a
    a= Integer.parseInt (stdin.readLine());

    System.out.print ("Type the value of b (double):>");
    b= Double.parseDouble (stdin.readLine());

    System.out.println ("a is: " + a);
    System.out.println ("b is: " + b);
    System.out.println ("this is done");
  }
}
