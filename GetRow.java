package letcode;

import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角：在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 动态规划
 * 总的来说就是利用杨辉三角形后一行与前一行的关系。
 * 更新过程为：从倒数第二个元素开始往前更新 它等于原来这个位置的数 + 前一个位置的数
 * 行[i] = 行[i] + 行[i-1]
 */
public class GetRow {
    /**
     * @param rowIndex 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i < dp.length; i++) { //前两行为1
            for (int j = i - 1; j > 0; j--)
                dp[j] = dp[j] + dp[j - 1]; // 该位置 = 原来这个位置的数 + 前一个位置的数
        }
        List<Integer> res = Arrays.asList(dp);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
