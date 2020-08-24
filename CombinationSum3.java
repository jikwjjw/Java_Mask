package letcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * <p>
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 */

public class CombinationSum3 {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        dfs(arr, 0, k, n, res, list);
        return res;
    }

    public void dfs(int[] arr, int i, int k, int n, List<List<Integer>> res, List<Integer> list) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(list));
        } else if (k <= 0 || n <= 0) {
            return;
        }
        for (int t = i; t < arr.length; t++) {
            list.add(arr[t]);
            dfs(arr, t + 1, k - 1, n - arr[t], res, list);
            list.remove(list.size() - 1);
        }
    }
}
