package letcode;

import java.util.Arrays;

/**
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * 示例 1:
 * 输入: [1, 5, 11, 5]
 * 输出: true
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 *  
 * <p>
 * 示例 2:
 * 输入: [1, 2, 3, 5]
 * 输出: false
 * 解释: 数组不能分割成两个元素和相等的子集.
 */
public class CanPartition {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        Arrays.sort(nums);
        if (total % 2 != 0) return false;
        if (total == 0) return true;
        return dfs(nums, total / 2, 0);
    }

    private boolean dfs(int[] nums, int target, int index) {
        if (target == 0) return true;
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (target - nums[i] < 0) return false;
            if (dfs(nums, target - nums[i], i + 1)) return true;
        }
        return false;
    }
}
