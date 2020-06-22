package letcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * ��ȱ������������
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
	 * @param combination ���룺"23"
	 * @param next_digits �����["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	 */
	public void backtrack(String combination, String next_digits) {
		// ���û�и������ֿɼ��
		if (next_digits.length() == 0) {
			// ������
			output.add(combination);
		}
		// �����������Ҫ���
		else {
			// ��������
			// ��һ����������
			String digit = next_digits.substring(0, 1);
			String letters = phone.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				String letter = phone.get(digit).substring(i, i + 1);
				// ����ǰ��ĸ׷�ӵ����
				// ��������һλ
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
