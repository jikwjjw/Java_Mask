package letcode;


/**
 * 0～n-1中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 *
 * 第一种即左闭右闭，所以我们的终止条件肯定是 left >= right所以我们的循环条件就出来了，又因为我们是左闭右闭，所以在进行划分区间时，已经判断了该值，所以是mid -/+ 1。
 *
 * 第二种即左闭右开，所以我们的终止条件肯定是 left < right所以我们的循环条件就出来了。又因为我们是左闭右开，所以在进行划分区间时，左边left已经判断了该值，所以是mid + 1。右边是mid
 *

 */
public class Search {
    /**
     * @param nums [0,1,2,3,4,5,6,7,9]
     * @return 8
     */
    public static int search(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else if (nums[mid] > mid) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        int target = 8;
        System.out.println(search(nums));
    }
}
