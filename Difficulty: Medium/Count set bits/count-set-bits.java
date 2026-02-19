class Solution {

    public static int countSetBits(int n) {
        if (n == 0) return 0;

        // Step 1: Find largest power of 2 <= n
        int x = largestPowerOf2(n);

        // Step 2: Count bits from 1 to (2^x - 1)
        int bitsTill2x = x * (1 << (x - 1));

        // Step 3: Count MSB bits from 2^x to n
        int msbBits = n - (1 << x) + 1;

        // Step 4: Remaining numbers after removing MSB
        int remainder = n - (1 << x);

        // Recursive call
        return bitsTill2x + msbBits + countSetBits(remainder);
    }

    // Function to find largest x such that 2^x <= n
    private static int largestPowerOf2(int n) {
        int x = 0;
        while ((1 << (x + 1)) <= n) {
            x++;
        }
        return x;
    }
}
