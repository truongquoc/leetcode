package String;

public class GreatestCommonDiviso {

    public static void main(String[] args) {
        System.out.println("result "+ gcdOfStrings("ABCABC", "ABC"));;
    }

    public static String gcdOfStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        String comparedString;

        if (str1.length() == minLength) {
            comparedString = str1;
        } else {
            comparedString = str2;
        }

        for(int i=minLength; i >= 1; i--) {
            String subStr =  comparedString.substring(0, i);
            String mathchStr1 = subStr;
            String matchStr2 = subStr;

            if ((str1.length() % subStr.length() != 0 ) || (str2.length() % subStr.length()) != 0) continue;

            int multipleByStr1 = str1.length() / subStr.length();
            int multipleByStr2 = str2.length() / subStr.length();
            for (int j = 0; j < multipleByStr1 -1 ; j++) {
                mathchStr1+= subStr;
            }

            for (int j = 0; j < multipleByStr2 - 1; j++) {
                matchStr2+=subStr;
            }

            if (mathchStr1.equals(str1) && matchStr2.equals(str2)) {
                return subStr;
            }

        }
        return "";
    }
}
