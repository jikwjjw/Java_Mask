package mask;

/**
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 * @author ji
 * ����λ�൱�ڳ�2
 * ����λ�൱�ڳ�2
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum =0;
        sum = (int)Math.pow(n,2)+n;
        return sum>>1;
    }
}