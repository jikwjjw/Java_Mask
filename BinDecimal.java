package mask;

import java.util.*;

import org.junit.Test;
/**
 * ��һ������0��1֮���ʵ��������Ϊdouble���������Ķ����Ʊ�ʾ������������޷���ȷ����32λ���ڵĶ����Ʊ�ʾ�����ء�Error��
 * ����һ��double num����ʾ0��1��ʵ�����뷵��һ��string����������Ķ����Ʊ�ʾ���ߡ�Error����
 * @author ji
 *
 */
public class BinDecimal {
    public String printBin(double num) {
        // write code here
        if(num>=1 || num<0) return "Error";
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        while(num>0){
            if(sb.length()>32){
                return "Error";
            }
            num =num*2;
            if(num>=1){
                sb.append("1");
                num -=1;
            }else{
                sb.append("0");
            }
        }
        return sb.toString();
    }
    @Test
    public void test1(){
    	System.out.println(printBin(0.625));
    }
}
