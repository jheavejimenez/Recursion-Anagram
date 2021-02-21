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
   
}
