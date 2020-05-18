package test;

/**
 * 
 * @author ji 普通递归版求法，利用递归式，自顶向下进行求解。时间复杂度为0(2^n)
 * 
 *         改进的递归式-->求解从自顶向下改为自底向上(循环实现)
 */

public class Solution {
	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int fibonacci2(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			a = a + b;
			b = a - b;
		}
		return a ; 
	}

}
