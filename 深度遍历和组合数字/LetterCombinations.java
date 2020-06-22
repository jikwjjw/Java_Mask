package letcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 深度遍历，组合数字
 * @author ji
 *
 */
public class LetterCombinations {
	Map<String, String> phone = new HashMap<String, String>() {
		{
			put("2", "abc");
			put("3", "def");
			put("4", "ghi");
			put("5", "jkl");
			put("6", "mno");
			put("7", "pqrs");
			put("8", "tuv");
			put("9", "wxyz");
		}
	};

	List<String> output = new ArrayList<String>();

	/**
	 * 
	 * @param combination 输入："23"
	 * @param next_digits 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	 */
	public void backtrack(String combination, String next_digits) {
		// 如果没有更多数字可检查
		if (next_digits.length() == 0) {
			// 组合完成
			output.add(combination);
		}
		// 如果还有数字要检查
		else {
			// 遍历集合
			// 下一个可用数字
			String digit = next_digits.substring(0, 1);
			String letters = phone.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				String letter = phone.get(digit).substring(i, i + 1);
				// 将当前字母追加到组合
				// 并继续下一位
				backtrack(combination + letter, next_digits.substring(1));
			}
		}
	}

	public List<String> letterCombinations(String digits) {
		if (digits.length() != 0)
			backtrack("", digits);
		return output;
	}

	@Test
	public void test1() {
//		int[] nums = { -1, 2, 1, -4 };
		System.out.println(letterCombinations("23"));
	}
}
