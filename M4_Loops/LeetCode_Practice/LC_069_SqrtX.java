package LeetCode_Practice;

public class LC_069_SqrtX {
    /*
     * ---------------------------------------------------------
     * LeetCode 69: Sqrt(x) (Easy)
     * ---------------------------------------------------------
     * Given a non-negative integer x, return the square root of x rounded down 
     * to the nearest integer. The returned integer should be non-negative as well.
     * 
     * Approach: Binary Search with a Loop
     * Time Complexity: O(log n)
     * We use a while loop to binary search the possible answers from 1 to x.
     */

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // To prevent overflow, instead of mid * mid == x, we use mid == x / mid
            if (mid == x / mid) {
                return mid;
            } 
            else if (mid < x / mid) {
                ans = mid; // potential answer, but we want the largest rounded down
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Sqrt(4): " + mySqrt(4)); // 2
        System.out.println("Sqrt(8): " + mySqrt(8)); // 2 (because 2.82 rounded down is 2)
        System.out.println("Sqrt(2147395599): " + mySqrt(2147395599)); // 46339
    }
}
