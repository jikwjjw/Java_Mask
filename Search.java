package string;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。

 * 你的算法时间复杂度必须是 O(log n) 级别。
 */
public class Search {
    /**
     *
     * @param nums = [4,5,6,7,0,1,2]
     * @param target = 0
     * @return 4
     */

    /**
     *
     * @param nums nums = [4,5,6,7,0,1,2]
     * @param target target = 3
     * @return -1
     */
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 先根据 nums[mid] 与 nums[left] 的关系判断 mid 是左边有序还是右边有序
            if (nums[mid] >= nums[left]) {
                // 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 left 和 right
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] nums = {4,5,6,7,9,0,1,2};
       int target = 0;
       search(nums,target);
    }
}
