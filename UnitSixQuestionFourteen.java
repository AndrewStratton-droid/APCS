package UnitSixCorrections;


/**
 * Write a description of class UnitSixQuestionFourteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitSixQuestionFourteen
{
    public static int positionOfFirstNegative(int[] values) {
        int index = 0;
        while (values[index] >= 0) {
        index++;
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] values = {-1};
        int firstNegative = positionOfFirstNegative(values);
        System.out.println(firstNegative);
    }
}