import java.util.*;
public class RomanNumbers {
//Split the string into characters.  //Doesn't look like I'm actually using this?
//Convert each character into its integer value
//for each, if current value >= next value, add current value to running total
//else add next value to running total and subtract current value


    public static int convertRoman(String str) {
        int result = 0;
       // char[] symbols = str.toCharArray();


        Map<Character, Integer> number = new HashMap<>();
        number.put('I', 1);
        number.put('V', 5);
        number.put('X', 10);
        number.put('L', 50);
        number.put('C', 100);
        number.put('D', 500);
        number.put('M', 1000);


        for (int i = 1; i < str.length(); i++) {
            if (number.get(str.charAt(i)) >= number.get(str.charAt(i - 1))) {
                result+=number.get(str.charAt(i) - number.get(str.charAt(i - 1)));

            }
            result += number.get(str.charAt(i - 1));

        }

        return result;

    }
}


