package Practical;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + java.util.Arrays.toString(array));
        
        reverseArray(array);
        
        System.out.println("Reversed Array: " + java.util.Arrays.toString(array));
    }
    
    public static void reverseArray(int[] arr) {
        int length = arr.length;
        int[] tempArray = new int[length]; // Temporary array to store reversed elements
        
        // Copy elements from original array to temporary array in reverse order
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[length - 1 - i];
        }
        
        // Copy elements from temporary array back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArray[i];
        }
    }
}
