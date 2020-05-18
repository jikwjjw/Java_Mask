package test;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *  求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author ji
 * 
 * f(n)=f(n-1)+f(n-2)+……f(1) f(n-1)=f(n-2)+……f(1) 
 * 两式相减得 f(n) = 2f(n-1) 
 * 而
 * f(1) = 1 
 * f(n) = pow(2, n - 1)
 * 
 */
public class JumpFloorII {
	public int JumpFloorII(int target) {
		return (int) Math.pow(2, target-1);
	}
}
