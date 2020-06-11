package mask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
/**
 * 
 * 请编写一个方法，返回某集合的所有非空子集。
 * 给定一个int数组A和数组的大小int n，请返回A的所有非空子集。
 * 保证A的元素个数小于等于20，且元素互异。各子集内部从大到小排序,子集之间字典逆序排序，见样例。
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