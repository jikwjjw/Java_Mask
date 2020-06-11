package mask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
/**
 * 
 * ���дһ������������ĳ���ϵ����зǿ��Ӽ���
 * ����һ��int����A������Ĵ�Сint n���뷵��A�����зǿ��Ӽ���
 * ��֤A��Ԫ�ظ���С�ڵ���20����Ԫ�ػ��졣���Ӽ��ڲ��Ӵ�С����,�Ӽ�֮���ֵ��������򣬼�������
 * @author ji
 * 
 */
public class Subset {
	/**
	 * 
	 * @param A [123,456,789]
	 * @param n A.length
	 * @return {[789,456,123],[789,456],[789,123],[789],[456 123],[456],[123]}
	 */
	public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(A);
		int max = 1 << n;
		for (int k = max - 1; k >= 1; k--) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = k, index = 0; i > 0; i >>= 1, index++) {
				if ((i & 1) == 1) {
					arr.add(A[index]);
				}
			}
			list.add(arr);
		}
		return list;
	}

	@Test
	public void test1() {
		int[] A ={456,123,789};
		System.out.println(getSubsets(A, A.length).toString());
	}
}