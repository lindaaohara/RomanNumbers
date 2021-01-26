import java.util.*;
public class RomanNumbers {
//Split the string into characters.  //Doesn't look like I'm actually using this?
//Convert each character into its integer value
//for each, if current value >= next value, add current value to running total
//else add next value to running total and subtract current value


    public static int convertRoman(String str) {

        // char[] symbols = str.toCharArray();


        Map<Character, Integer> number = new HashMap<>();
        number.put('I', 1);
        number.put('V', 5);
        number.put('X', 10);
        number.put('L', 50);
        number.put('C', 100);
        number.put('D', 500);
        number.put('M', 1000);
        number.put('o', 0);

        String str1= str+"o";
        int result = 0;

        for (int i = 0; i<str1.length()-1; i++) {
            if (number.get(str1.charAt(i)) >= number.get(str1.charAt(i + 1))) {
                result += number.get(str1.charAt(i));

            }else{
                    result += number.get(str1.charAt(i+1) - number.get(str1.charAt(i)));
                }


            }

            return result;

        }
        /*
        int tempNum;
        int preNum = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            tempNum = number.get(str.charAt(i));
            if (tempNum < preNum) {
                result -= tempNum;
            } else {
                result += tempNum;
                preNum += tempNum;

            }
        }
        return result;
    }*/
}



