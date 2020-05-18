package test;

/**
 * 
 * @author ji ��ͨ�ݹ���󷨣����õݹ�ʽ���Զ����½�����⡣ʱ�临�Ӷ�Ϊ0(2^n)
 * 
 *         �Ľ��ĵݹ�ʽ-->�����Զ����¸�Ϊ�Ե�����(ѭ��ʵ��)
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
