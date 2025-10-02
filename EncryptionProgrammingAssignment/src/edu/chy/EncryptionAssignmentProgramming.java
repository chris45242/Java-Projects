package edu.chy;

// author: Chris Young

import java.util.Scanner;
import java.lang.String;
import java.util.Random;

public class EncryptionAssignmentProgramming {

    public static void main(String[] args)
	// write your code here
        {
            // TODO code application logic here
            Scanner sc = new Scanner(System.in);
            String plainText, encryptedText, decryptedText;

            System.out.print("Enter message: ");
            plainText = sc.nextLine();

            System.out.println();
            System.out.println("Encrypted message");
            encryptedText = EncryptMessage(plainText);
            System.out.println(encryptedText);
            System.out.println();

            System.out.println("Decrypted message:");
            decryptedText = DecryptMessage(encryptedText);
            System.out.println(decryptedText);
        }
        // This function takes a character and returns it as an encrypted 4-character string
        public static String EncryptCharacter(char character)
        {
            // You need to implement this function
            String hexCharacter, encryptedChar;
            final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Random rnd = new Random();
            char randChar1 = alphabet.charAt(rnd.nextInt(alphabet.length()));
            char randChar2 = alphabet.charAt(rnd.nextInt(alphabet.length()));

             // Converting a character to a hexadecimal ASCII String
            hexCharacter = Integer.toHexString(character);

            // Create a new character that consists of concatenation of a random character
            // + the first hex digit + a random character + the second hex digit.
            encryptedChar = randChar1 + hexCharacter.substring(0,1) + randChar2 + hexCharacter.substring(1);

           return encryptedChar;
        }

        // This function takes an encrypted character string and returns a decrypted character
        public static String DecryptCharacter(String encryptedCharacter)
        {
            // You need to implement this function
            String plainChar;
            String hexCharacter;
            int ASCIIcode;
            String character;
            char encryptedChar1;
            char encryptedChar2;


            hexCharacter = encryptedCharacter.substring(1, 2) + encryptedCharacter.substring(3);
            plainChar = Character.toString( (char) Integer.parseInt(hexCharacter, 16));

            return plainChar;
        }

        // This function takes a plaintext message and returns the message as an encrypted string.
        public static String EncryptMessage(String plainText)
        {
            // You need to implement this function
            // Initialize variables
            String encryptedMessage = "";
            char encryptedChar;

            for(int i = 0; i < plainText.length(); i++)
            {
             // get the character
             encryptedChar = plainText.charAt(i);
             // concatenate the This character onto the encrypted message string
             encryptedMessage = encryptedMessage + EncryptCharacter(encryptedChar);

            }
            return encryptedMessage;
        }

        // This function takes an encrypted message and returns it as a decrypted message.
        public static String DecryptMessage(String encryptedText)
        {
            // You need to implement this function
            String decryptMessage = "";
            String encryptedChar = "";
            String hexCharacter = new String();
            String plainText;
            String decodedChar;
            String ASCIIcode;
            //String decryptedText = DecryptMessage(encryptedText);

            for(int i = 0; i < encryptedText.length(); i+=4)
            {
             // get the four decode characters that make up one character
             encryptedChar = encryptedText.substring(i,i + 4);
             // call DecryptCharacter to get the decoded character back
             String decryptedChar = DecryptCharacter(encryptedChar);
             // concatenate the decoded character to the message
             decryptMessage = decryptMessage + decryptedChar;
             }

            return decryptMessage;
        }



    }

