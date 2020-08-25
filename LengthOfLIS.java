package letcode;

import java.util.Arrays;

/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[] dp = new int[len];
        Arrays.fill(dp, 1);// 自己一定是一个子序列
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                // 看以前的，比它小的，说明可以接在后面形成一个更长的子序列
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = dp[0];
        for (int i = 0; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    /**
     * 第 1 步：定义状态
     * 由于一个子序列一定会以一个数结尾，于是将状态定义成：dp[i] 表示以 nums[i] 结尾的「上升子序列」的长度。注意：这个定义中 nums[i] 必须被选取，且必须是这个子序列的最后一个元素。
     *
     * 第 2 步：考虑状态转移方程
     * 遍历到 nums[i] 时，需要把下标 i 之前的所有的数都看一遍；
     * 只要 nums[i] 严格大于在它位置之前的某个数，那么 nums[i] 就可以接在这个数后面形成一个更长的上升子序列；
     * 因此，dp[i] 就等于下标 i 之前严格小于 nums[i] 的状态值的最大者 +1
     * 语言描述：在下标 i 之前严格小于 nums[i] 的所有状态值中的最大者 +1。
     * dp[i] = Math.max(dp[i], dp[j] + 1);
     *
     *第 3 步：考虑初始化
     * dp[i] = 1，11 个字符显然是长度为 11 的上升子序列。
     *
     * 第 4 步：考虑输出
     * 这里要注意，不能返回最后一个状态值；
     * 还是根据定义，最后一个状态值只是以 nums[len - 1] 结尾的「上升子序列」的长度；
     * 状态数组 dp 的最大值才是最后要输出的值。
     *
     * 作者：liweiwei1419
     * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence/solution/dong-tai-gui-hua-er-fen-cha-zhao-tan-xin-suan-fa-p/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
