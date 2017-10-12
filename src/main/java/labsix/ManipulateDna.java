package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class ManipulateDna {

  /** This is a javaDoc Comment. */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Noah Stape " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    
    String dna = scanner.nextLine();
    System.out.println("The DNA string is: " + dna);
    
    // Step Two: Compute the complement of the DNA String
    
    dna = dna.replace('a','T'); 
    dna = dna.replace('t','A'); 
    dna = dna.replace('c','G');
    dna = dna.replace('g','C');

    dna = dna.toUpperCase();

    System.out.println("The complement of the DNA string is " + dna);

    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    
    // Creating a string that my random character will come from
    String code = ("ACGT");
    Random rthing = new Random();

    // creating my random characters and integers

    char randomChar = code.charAt(rthing.nextInt(4));
    int randomPos1 = rthing.nextInt(4);

    //creating two parts of the string according to the random interger

    String dnaPart1 = dna.substring(0, randomPos1);
    String dnaPart2 = dna.substring(randomPos1, 4);

    // adding in the random character at the random position

    String dnaInsert = (dnaPart1 + randomChar + dnaPart2);

    //Displaying

    System.out.println("Inserting " + randomChar + " at " 
        + (randomPos1 + 1) + " results in " + dnaInsert);

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    
    /* This part was very complicated and required a lot of trouble shooting
    */

    int randomPos2 = rthing.nextInt(4);

    int removedNumber = (randomPos2 + 1);

    String dnaHalf1 = dna.substring(0, (removedNumber - 1));
    String dnaHalf2 = dna.substring(removedNumber , 4);

    String dnaDelete = (dnaHalf1 + dnaHalf2);

    System.out.println("Deleting from postiion " + (randomPos2 + 1) + " gives " + dnaDelete);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    /* Throughout the program i created multiple temporary variable and I am not sure if 
    that is allowed. */

    int randomPos3 = rthing.nextInt(4);
    
    char randomLetter = code.charAt(rthing.nextInt(4));
  
    String dnaFirst = dna.substring(0, (randomPos3 - 1));
    String dnaSecond = dna.substring((randomPos3), 4);

    dna = (dnaFirst + randomLetter + dnaSecond);
    System.out.println("Changing position " + (randomPos3) + " gives " + dna);

    // Step Six: Display a final thankyou message
    
    System.out.println("Thank you for using the program! \nPlease have a great day!");

  }

}
