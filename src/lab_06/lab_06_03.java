package lab_06;

import java.util.HashSet;

public class lab_06_03 {
    public static void main(String[] args) {
        /*
        * myStr = "100 minutes". NOT use REGEX, extract digit character from that String
        * String result = "";
        * HashSet<String> setStrDigits {"0", "1",...,"9"}
        * for i = 0, j = i+1, j <= myStr.length, i++, j++:
        *   if setStrDigits.contains(myStr.subString(i,j)) : result = result + myStr.subString(i,j);
        * */

        String myStr = "100 minutes";
        String result = "";
        HashSet<String> setStrDigits = new HashSet<>();
        setStrDigits.add("0");
        setStrDigits.add("1");
        setStrDigits.add("2");
        setStrDigits.add("3");
        setStrDigits.add("4");
        setStrDigits.add("5");
        setStrDigits.add("6");
        setStrDigits.add("7");
        setStrDigits.add("8");
        setStrDigits.add("9");

        for (int i = 0, j = i + 1; j <= myStr.length(); i++,j++) {
            if (setStrDigits.contains(myStr.substring(i,j))) result = result + myStr.substring(i,j);
        }

        System.out.println(result);

    }
}
