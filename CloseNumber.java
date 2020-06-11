package mask;

import java.util.*;
/**
 * 有一个正整数，请找出其二进制表示中1的个数相同、且大小最接近的那两个数。(一个略大，一个略小)
 * 给定正整数int x，请返回一个vector，代表所求的两个数（小的在前）。保证答案存在。
 * @author ji
 *
 */
public class CloseNumber {
    public int[] getCloseNumber(int x) {
        int min =x-1;
        int max =x+1;
        while(Integer.bitCount(x)!=Integer.bitCount(min)&&min>0){
            min--;
        }
        while(Integer.bitCount(x)!=Integer.bitCount(max)){
            max++;
        }
       int arr[]={min,max};
        return arr;
    }
}