package mask;

import java.util.*;
/**
 * ��һ�������������ҳ�������Ʊ�ʾ��1�ĸ�����ͬ���Ҵ�С��ӽ�������������(һ���Դ�һ����С)
 * ����������int x���뷵��һ��vector�������������������С����ǰ������֤�𰸴��ڡ�
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