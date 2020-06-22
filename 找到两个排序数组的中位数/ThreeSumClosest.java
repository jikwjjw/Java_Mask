package letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * @author ji
 *
 */
public class ThreeSumClosest {
	/**
	 * 
	 * @param nums nums = [-1,2,1,-4], 
	 * @param target target = 1
	 * @return 2
	 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
	 */
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3)
			return 0;
		int a = Math.abs(nums[0] - target);
		int b = Math.abs(nums[1] - target);
		int c = Math.abs(nums[2] - target);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		for (int i = 3; i < nums.length; i++) {
			Collections.sort(list);
			if (Math.abs(nums[i] - target) > list.get(list.size() - 1)) {
				list.remove(2);
				list.add(i);
			}
		}
		int ans = nums[list.get(0)] + nums[list.get(1)] + nums[list.get(2)];
		return ans;
	}

	@Test
	public void test1() {
		int[] nums = { -1, 2, 1, -4 };
		System.out.println(threeSumClosest(nums, -1));
	}
}
