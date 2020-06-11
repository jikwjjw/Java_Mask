package mask;

/**
 * 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。
 * 给定两个整数int A，int B。请返回需要改变的数位个数。
 * @author ji
 *
 */
import java.util.*;

import org.junit.Test;

public class Transform {
	public int calcCost(int A, int B) {
		// 统计1的个数
		// return Integer.bitCount(A^B);
		int num = A ^ B;
		int count = 0;
		while (num != 0) {
			count++;
			num = num & (num - 1);
		}
		return count++;

	}

	@Test
	public void test1() {
		System.out.println(calcCost(3, 5));
	}
}