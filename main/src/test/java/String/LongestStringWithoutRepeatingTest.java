package String;

import com.solution.String.LongestStringWithoutRepeating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestStringWithoutRepeatingTest {
        @Test
        public void testLengthOfLongestSubstring() {
            // Test case 1
            String s1 = "abcabcbb";
            int expected_s1 = 3;
            int result_s1 = LongestStringWithoutRepeating.lengthOfLongestSubstring(s1);
            assertEquals(expected_s1, result_s1);

            // Test case 2
            String s2 = "ohvhjdml";
            int expected_2 = 6;
            int result_2 = LongestStringWithoutRepeating.lengthOfLongestSubstring(s2);
            assertEquals(expected_2, result_2);
        }
}
