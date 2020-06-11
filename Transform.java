package mask;

/**
 * ��дһ��������ȷ����Ҫ�ı伸��λ�����ܽ�����Aת�������B��
 * ������������int A��int B���뷵����Ҫ�ı����λ������
 * @author ji
 *
 */
import java.util.*;

import org.junit.Test;

public class Transform {
	public int calcCost(int A, int B) {
		// ͳ��1�ĸ���
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