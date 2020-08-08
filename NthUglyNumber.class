package letcode;

/**
 * 丑数
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 */
public class NthUglyNumber {
    /**
     * @param n = 10
     * @return 12
     * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
     * <p>
     * 第一个丑数是1，以后的丑数都是基于前面的小丑数分别乘2，3，5构成的。
     * 我们每次添加进去一个当前计算出来个三个丑数的最小的一个，并且是谁计算的，谁指针就后移一位。
     * dp[i]=min(dp[a]×2,dp[b]×3,dp[c]×5)
     */
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i <n; i++) {
            int n2 = dp[a] * 2;
            int n3 = dp[b] * 3;
            int n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;
        }
        System.out.println(dp[n-1]);
        return dp[n-1];
    }

    public static void main(String[] args) {
        nthUglyNumber(10);
    }
}
