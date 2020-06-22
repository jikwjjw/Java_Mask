package letcode;

/**
 * �ҵ����������������λ��
 * @author ji
 *
 */
public class FMSA {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 if (nums1.length > nums2.length) {
	            int[] temp = nums1;
	            nums1 = nums2;
	            nums2 = temp;
	        }

	        int m = nums1.length;
	        int n = nums2.length;

	        // �ָ�����ߵ�����Ԫ����Ҫ����ĸ��� m + (n - m + 1) / 2;
	        int totalLeft = (m + n + 1) / 2;

	        // �� nums1 ������ [0, m] �����ǡ���ķָ��ߣ�
	        // ʹ�� nums1[i - 1] <= nums2[j] && nums2[j - 1] <= nums1[i]
	        int left = 0;
	        int right = m;

	        while (left < right) {
	            int i = left + (right - left + 1) / 2;
	            int j = totalLeft - i;
	            if (nums1[i - 1] > nums2[j]) {
	                // ��һ������������ [left, i - 1]
	                right = i - 1;
	            } else {
	                // ��һ������������ [i, right]
	                left = i;
	            }
	        }

	        int i = left;
	        int j = totalLeft - i;
	        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
	        int nums1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
	        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
	        int nums2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];

	        if (((m + n) % 2) == 1) {
	            return Math.max(nums1LeftMax, nums2LeftMax);
	        } else {
	            return (double) ((Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin))) / 2;
	        }
	}
}
