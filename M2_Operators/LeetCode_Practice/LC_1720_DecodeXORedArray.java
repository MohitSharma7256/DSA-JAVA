/**
 * LEETCODE ID: 1720
 * TITLE: Decode XORed Array
 */
public class LC_1720_DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] result = new int[n + 1];
        result[0] = first;
        for (int i = 0; i < n; i++) {
            // Logic: if result[i] ^ result[i+1] = encoded[i], 
            // then result[i+1] = encoded[i] ^ result[i]
            result[i + 1] = encoded[i] ^ result[i];
        }
        return result;
    }
}
