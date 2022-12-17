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

        // declaring an integer variable j and setting it equal to the length of the character array

        int j = ch.length;

        // using a for loop that increments downward
        // int i is equal to the length of the character array
        for( int i = j; i>0; i--)
        {
            // subtract one from the length of the cahracter array and then the for loop will increment downward from the index
            System.out.println(ch[i - 1]);
        }



    }
 }