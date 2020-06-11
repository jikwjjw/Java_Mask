package mask;

import java.util.*;

import org.junit.Test;
/**
 * 有一个介于0和1之间的实数，类型为double，返回它的二进制表示。如果该数字无法精确地用32位以内的二进制表示，返回“Error”
 * 给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
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
