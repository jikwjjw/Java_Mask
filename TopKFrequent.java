package letcode;

import java.util.*;

/**
 * 前 K 个高频元素
 * 根据大根堆
 */
public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(((o1, o2) -> o2.getValue() - o1.getValue()));
        while (it.hasNext()) {
            queue.offer(it.next());
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> currentEntry = queue.poll();
            ans[i] = currentEntry.getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 4};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
