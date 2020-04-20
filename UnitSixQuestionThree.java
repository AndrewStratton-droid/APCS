package UnitSixCorrections;
public class UnitSixQuestionThree
{
    public static int checkString(String[] arr) {
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length() >= 3) {
                count++;
            }

        }
        return count;
    }
//Both code segments compile without error   
    public static void main(String[] args) {
        checkString(new String[0]);
        String[] str = {"cat", "dog"};
        System.out.println(checkString(str));
    }
}