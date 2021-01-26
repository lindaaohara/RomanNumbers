import java.util.*;
public class RomanNumbers {

//Create a map with Roman numerial as key and equivalent Integer as value
//for each char if current value >= next value, add current value to running total
//else add next value to running total and subtract current value
//as a quick ugly fix, added another value to the String to avoid null & string out of bound errors

    public static int convertRoman(String str) {

        Map<Character, Integer> number = new HashMap<>();
        number.put('I', 1);
        number.put('V', 5);
        number.put('X', 10);
        number.put('L', 50);
        number.put('C', 100);
        number.put('D', 500);
        number.put('M', 1000);
        number.put('o', 0);

        String str1 = str + "o";
        int result = 0;
        int i = 0;
        /*

        while (i < str1.length() - 1) {
            if (number.get(str1.charAt(i)) >= number.get(str1.charAt(i + 1)))
                result += number.get(str1.charAt(i));
            else {
                result = result + number.get(str1.charAt(i + 1)) - number.get(str1.charAt(i));
                i++;
            }
            i++;
        }
        return result;
    }*/

       for (i = 0; i<str1.length()-1; i++) {
            if (number.get(str1.charAt(i)) >= number.get(str1.charAt(i + 1)))
                result += number.get(str1.charAt(i));
            else{
                    result = result + number.get(str1.charAt(i+1)) - number.get(str1.charAt(i));
                    i++;
                }
            }
            return result;

        }
        /*From Sam
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



