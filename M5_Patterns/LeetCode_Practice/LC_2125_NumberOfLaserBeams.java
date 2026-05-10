package LeetCode_Practice;

public class LC_2125_NumberOfLaserBeams {
    /*
     * ---------------------------------------------------------
     * LeetCode 2125: Number of Laser Beams in a Bank (Medium)
     * ---------------------------------------------------------
     * Anti-theft security devices are activated inside a bank. You are given a 
     * 0-indexed string array 'bank' representing the floor plan.
     * bank[i] consists of '0's and '1's. '0' is empty, '1' is a security device.
     * 
     * A laser beam connects two security devices IF they are on different rows 
     * AND there are no security devices in any row between them.
     * 
     * Approach: Loop counting math
     * The number of beams between row A and row B is simply: 
     * (number of devices in row A) * (number of devices in row B).
     * If a row has 0 devices, we completely ignore it.
     */

    public static int numberOfBeams(String[] bank) {
        int prevDeviceCount = 0;
        int totalBeams = 0;
        
        for (String row : bank) {
            int currentCount = 0;
            // Count devices ('1's) in the current row
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    currentCount++;
                }
            }
            
            // If this row has devices, calculate beams
            if (currentCount > 0) {
                totalBeams += (prevDeviceCount * currentCount);
                prevDeviceCount = currentCount; // Update previous for the next iteration
            }
        }
        
        return totalBeams;
    }

    public static void main(String[] args) {
        String[] bank1 = {"011001", "000000", "010100", "001000"};
        System.out.println("Beams in Bank 1: " + numberOfBeams(bank1)); 
        // Row 1 has 3. Row 2 has 0. Row 3 has 2. Row 4 has 1.
        // Beams: (3 * 2) + (2 * 1) = 6 + 2 = 8
        
        String[] bank2 = {"000", "111", "000"};
        System.out.println("Beams in Bank 2: " + numberOfBeams(bank2)); 
        // 0
    }
}
