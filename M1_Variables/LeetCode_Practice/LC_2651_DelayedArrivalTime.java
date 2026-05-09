/**
 * LEETCODE ID: 2651
 * TITLE: Calculate Delayed Arrival Time
 */
public class LC_2651_DelayedArrivalTime {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        // Return (arrival + delay) in 24-hour format
        return (arrivalTime + delayedTime) % 24;
    }
}
