import java.util.Scanner;
import java.io.*;
public class print{
    public static void main(String[] args){
      
        String word;
        int num = 0, i = 1;
        char letter;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        word = input.next();
       
        num = word.length();
        num = num - 1;
        System.out.println();
        
        do {
            letter = word.charAt(num);
            System.out.print(letter);
            num = num - 1;
        } while (num >= 0);
        
        System.out.println();
        
        
        while (i == 1)
        {
            System.out.println("Enter a word:");
            System.out.println("Press 'control + C' to exit.");
            word = input.next();
            
            num = word.length();
            num = num - 1;
            System.out.println();
            
            do {
                letter = word.charAt(num);
                System.out.print(letter);
                num = num - 1;
            } while (num >= 0);
            
            System.out.println();

        }
            }
}