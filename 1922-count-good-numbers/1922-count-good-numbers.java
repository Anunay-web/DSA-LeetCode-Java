class Solution {
    private static final long MOD = 1000000007L;
 
    /*
     * Computes base raised to exponent under modulo
     * using binary exponentiation.
     */
    private long modPower(long base, long exponent) {
        // This stores the running answer for the power calculation.
        long result = 1;
 
        while (exponent > 0) {
            // If the current bit of the exponent is 1,
            // include the current base in the answer.
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
 
            // Square the base so it represents the next power block.
            base = (base * base) % MOD;
 
            // Move to the next bit by cutting the exponent in half.
            exponent /= 2;
        }
 
        return result;
    }
 
    /*
     * Counts how many good digit strings of length n
     * can be formed under the given rules.
     */
    public int countGoodNumbers(long n) {
        // This stores how many positions use even-digit choices.
        long evenPositions = (n + 1) / 2;
 
        // This stores how many positions use prime-digit choices.
        long oddPositions = n / 2;
 
        // This stores all valid ways to fill even indices.
        long evenWays = modPower(5, evenPositions);
 
        // This stores all valid ways to fill odd indices.
        long oddWays = modPower(4, oddPositions);
 
        return (int) ((evenWays * oddWays) % MOD);
    }
}