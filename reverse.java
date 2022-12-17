/*
 * program should be able to take a string from user and reverse it 
 */

 import java.util.Scanner;

 public class reverse {
    public static void main( String [] args) {
        //declare a str varable
        String str;
        // added a scanner into program
        Scanner scan = new Scanner(System.in);
        //prompt for user
        System.out.println("type in a word");
        // scans for user input
        str = scan.nextLine();
        
        // time to convert the string to a character (char) array ([])

        // toCharArray method converts a string to a character array where its contents are initialized with the characters of the string
        char [] ch = str.toCharArray();

        System.out.println("reverse of a string is: ");



    }
 }