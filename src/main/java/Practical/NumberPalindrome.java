package Practical;


public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 12345; // Example number

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) 
    
    {
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();
        
        return original.equals(reversed);
    }
}