/**
 * LEETCODE ID: 1688
 * TITLE: Count of Matches in Tournament
 */
public class LC_1688_TournamentMatches {
    public int numberOfMatches(int n) {
        // Math Logic: To have 1 winner, n-1 people must lose.
        return n - 1;
    }
}
