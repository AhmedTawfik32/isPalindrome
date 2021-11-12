/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkpalindrome;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text value: ");
        String text = input.next();

        if (isPalindrome(text)) {
            System.out.println("The text is Palindrome");
        } else {
            System.out.println("The text is not Palindrome");
        }

    }

    public static boolean isPalindrome(String text) {

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
