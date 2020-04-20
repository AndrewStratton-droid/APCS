package UnitSevenCorrections;
import java.util.*;

public class UnitSevenQuestionFifteen {
    //Returns the index of the target
    public static int seqSearch (int[] arr, int target) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                return j;
            }
        }
        return -1;
    }
    
    //Returns the target if it exists in the arraylist
    public static int seqSearchAlt (int[] arr, int target) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                return arr[j];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 7;
        System.out.println(seqSearch (array, target));
        System.out.println(seqSearchAlt (array, target));
    }
}

