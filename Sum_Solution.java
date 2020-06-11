package mask;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author ji
 * 左移位相当于乘2
 * 右移位相当于除2
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum =0;
        sum = (int)Math.pow(n,2)+n;
        return sum>>1;
    }
}