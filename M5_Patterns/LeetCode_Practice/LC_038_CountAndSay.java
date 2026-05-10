package LeetCode_Practice;

public class LC_038_CountAndSay {
    /*
     * ---------------------------------------------------------
     * LeetCode 38: Count and Say (Medium)
     * ---------------------------------------------------------
     * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
     * countAndSay(1) = "1"
     * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), 
     * which is then converted into a different digit string.
     * 
     * Pattern:
     * 1
     * 11 (one 1)
     * 21 (two 1s)
     * 1211 (one 2, one 1)
     * 111221 (one 1, one 2, two 1s)
     * 
     * Approach: Loop Pattern Generation
     * Build the string iteratively. Count adjacent identical characters and append.
     */

    public static String countAndSay(int n) {
        if (n == 1) return "1";
        
        String result = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j - 1));
                    count = 1; // Reset count for the new character
                }
            }
            // Append the last counted character
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Count and Say 4: " + countAndSay(4)); // Expected: 1211
        System.out.println("Count and Say 5: " + countAndSay(5)); // Expected: 111221
    }
}
