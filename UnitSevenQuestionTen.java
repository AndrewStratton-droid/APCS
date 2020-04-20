package UnitSevenCorrections;
import java.util.*;


public class UnitSevenQuestionTen {
    //Will produce an incorrect result
    public static boolean isReversed(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        for (int j = 0; j < firstList.size() / 2; j++) {
            if (firstList.get(j) != secondList.get(secondList.size() - 1 - j)) {
                return false;
            }
        }
        return true;
    }        
    
    //Fixed: produces a correct result because the loop iterates all the way through
        public static boolean isReversedButWorksProperly(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        for (int j = 0; j < firstList.size(); j++) {
            if (firstList.get(j) != secondList.get(secondList.size() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<Integer>();
            listOne.add(1);
            listOne.add(3);
            listOne.add(5);
            listOne.add(7);
        ArrayList<Integer> listTwo = new ArrayList<Integer>();
            listTwo.add(5);
            listTwo.add(5);
            listTwo.add(3);
            listTwo.add(1);
        System.out.println(isReversed(listOne, listTwo));
        System.out.println(isReversedButWorksProperly(listOne, listTwo));
    }
}
