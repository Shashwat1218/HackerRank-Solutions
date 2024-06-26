import java.util.Scanner;

public class Solution {
    
    // Function to calculate the number of 'a's in the first `n` characters of the infinite string
    public static long repeatedString(String s, long n) {
        // Count occurrences of 'a' in the string `s`
        long countOfAInS = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countOfAInS++;
            }
        }

        // Calculate how many complete repetitions of `s` fit into `n` characters
        long fullRepeats = n / s.length();
        
        // Calculate remaining characters after full repetitions
        long remainingChars = n % s.length();

        // Total count of 'a' in the first `n` characters
        long totalAs = fullRepeats * countOfAInS;

        // Count 'a's in the remaining characters
        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                totalAs++;
            }
        }

        return totalAs;
    }

    // Main method where the program starts execution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string `s` and number `n`
        String str = sc.next();
        long num = sc.nextLong();
        
        // Output the result of `repeatedString` function
        System.out.println(repeatedString(str, num));
    }
}
