package test;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 *  �����������һ��n����̨���ܹ��ж�����������
 * 
 * @author ji
 * 
 * f(n)=f(n-1)+f(n-2)+����f(1) f(n-1)=f(n-2)+����f(1) 
 * ��ʽ����� f(n) = 2f(n-1) 
 * ��
 * f(1) = 1 
 * f(n) = pow(2, n - 1)
 * 
 */
public class JumpFloorII {
	public int JumpFloorII(int target) {
		return (int) Math.pow(2, target-1);
	}
}
