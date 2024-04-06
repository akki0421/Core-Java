package Practical;

public class AlternateReverse {
    public static void main(String[] args) {
        String sentence = "My Name Is Akshay";
        String reversedSentence = reverseAlternateWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed alternate words: " + reversedSentence);
    }
    
    public static String reverseAlternateWords(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");
        
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
                StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
                result.append(reversedWord).append(" ");
            } else {
                result.append(words[i]).append(" ");
            }
        }
        
        return result.toString().trim();
    }
}
