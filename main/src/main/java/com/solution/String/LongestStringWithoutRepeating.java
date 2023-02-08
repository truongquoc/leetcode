package com.solution.String;

import java.util.HashMap;
import java.util.Map;

public class LongestStringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        Map<String, Integer> characterMap = new HashMap();
        int maxLength = 0;
        int comparedLen;

        for (int i=0; i< s.length() ; i++) {
            comparedLen=1;
            characterMap.put(Character.toString(s.charAt(i)), 1);
            for(int j= i+1; j < s.length(); j++) {
                if (characterMap.containsKey(Character.toString(s.charAt(j)))) {
                    break;
                }
                characterMap.put(Character.toString(s.charAt(j)), 1);
                comparedLen++;
            }
            if (comparedLen > maxLength) {
                maxLength =comparedLen;
            }

            characterMap = new HashMap();
        }

        return maxLength;
    }
}
