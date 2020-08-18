package letcode;

import java.util.List;

/**
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 */
public class MinimumTotal {
    /**
     * 三角形最小路径和
     * 动态转移方程：f(i,j)=min(f(i+1,j),f(i+1,j+1))+triangle[i][j]
     */
    public int minimumTotal1(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    /**
     * 在上述代码中，我们定义了一个 N 行 N 列 的 dp 数组（N 是三角形的行数）。
     * 但是在实际递推中我们发现，计算 dp[i][j] 时，只用到了下一行的 dp[i + 1][j] 和 dp[i + 1][j + 1]
     * 因此 dp 数组不需要定义 N 行，只要定义1行就阔以啦。
     * 所以我们稍微修改一下上述代码，将 i 所在的维度去掉（如下），就可以将 O(N^2)的空间复杂度优化成 O(N)
     *
     * @param triangle
     * @return
     */
    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
