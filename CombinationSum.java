package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSum {
    List<List<Integer>> lists = new ArrayList<>();

    /**
     *
     * @param candidates candidates = [2,3,6,7],
     * @param target target = 7
     * @return
     * [
     *   [7],
     *   [2,2,3]
     * ]
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0 || candidates == null || target < 0) {
            return lists;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        comProcess(0, candidates, target, list);
        return lists;
    }

    public void comProcess(int start, int[] candidates, int target, ArrayList<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            lists.add(new ArrayList<Integer>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                comProcess(i, candidates, target - candidates[i], list);
                list.remove(list.size() - 1);
            }
        }
    }
}
