package Recursion;

import java.util.Scanner;
public class RecursionAnagram {
    private static void anagram(String input, String currentAnagram)
    {
        if (currentAnagram.length() == 0) {
            System.out.println(input);
            return;
        }
 
        for (int i = 0; i < currentAnagram.length(); i++)
        {
            String newinput = input + currentAnagram.charAt(i);
 
            String newAnagram = currentAnagram.substring(0, i) + currentAnagram.substring(i + 1);
            // Recurvise call 
            anagram(newinput, newAnagram);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); 
        String name = s.nextLine();
        System.out.println("Full Name: "+ name);
        
        System.out.print("Enter the initial of your Fullname: ");
        String init = s.nextLine();
        s.close();
        System.out.println("");
        System.out.println("Here are all the anagrams of " + init);
        
        anagram("", init);
        System.out.println("");
 
        System.out.print("Thank You!");
    }
}
