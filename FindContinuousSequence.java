package letcode.tree;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 和为s的连续正数序列.
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindContinuousSequence {
    /**
     * @param target = 9
     * @return [[2, 3, 4], [4, 5]]
     */
    public static int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        while (i <= target / 2) { //不包含target
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] res = new int[j - i];
                for (int k = i; k < j; k++) {
                    res[k - i] = k;
                }
                list.add(res);
                sum -= i;
                i++;
            }
        }
        for (int t = 0; t < list.size(); t++) {
            System.out.println(Arrays.toString(list.get(t)));
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(findContinuousSequence(9));
    }
}
