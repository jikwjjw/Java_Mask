import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test_linux {


    /**
     * https://leetcode-cn.com/problems/permutations/
     * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
     *
     * @param nums [1,2,3]
     * @return [
     * [1,2,3],
     * [1,3,2],
     * [2,1,3],
     * [2,3,1],
     * [3,1,2],
     * [3,2,1]
     * ]
     */

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Stack<Integer> path = new Stack<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    /**
     * @param nums  数组
     * @param len   数组长度
     * @param depth 深度遍历且回溯，数字的使用就是树的层数
     * @param path  路径即结果
     * @param used  存储一个数是否使用过
     * @param res   答案
     */
    private void dfs(int[] nums, int len, int depth, Stack<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            } else {
                path.push(nums[i]);
                used[i] = true;
            }
            dfs(nums, len, depth + 1, path, used, res);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] strs = {1, 2, 3};
        test_linux ts = new test_linux();
        System.out.println(ts.permute(strs));
    }
}
