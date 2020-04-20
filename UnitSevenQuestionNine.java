package UnitSevenCorrections;
import java.util.*;

//The remove method returns the value of the element removed
public class UnitSevenQuestionNine {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.remove(i));
        }
    }
}
