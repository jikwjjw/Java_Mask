package dajiang;

import java.util.Scanner;

/**
 * 小C平时最喜欢玩数字游戏，最近他碰到一道有趣的数字题，他和他的好朋友打赌，一定能在10分钟内解出这道题，成功完成，小C就可以得到好朋友送他的Switch游戏机啦，你能帮助小C赢得奖品吗？
 * 题目是这样的：给定一个非负的、字符串形式的整形数字，例如“12353789”，字符串的长度也就是整形数字的位数不超过10000位，并且字符串不会以0开头，小C需要挑选出其中K个数字（K小于字符串的长度）并删掉他们，使得剩余字符组成新的整数是最小的。
 */
public class Djiang3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();//获取字符串
        String len = sc.nextLine();//获取字符串长度
        System.out.println(Solution.removeKdigits(num, len));
    }
}

class Solution {
    /**
     * @param num 第一行输入一串纯数字形式的字符串，组成一个正整数 // (71245323308,4)->1223308, (1683212,3)->1212,(100,1)->0
     * @param len 第二行输入一个正整数K (K < 字符串的长度)
     * @return 输出一个数字（字符串格式）
     */
    public static String removeKdigits(String num, String len) {
        int k = Integer.parseInt(len);
        StringBuilder sb = new StringBuilder(num);
        while (k > 0) {
            int i = 0;
            while (sb.length() - 1 > i && sb.charAt(i + 1) >= sb.charAt(i)) {
                i++;
            }
            sb.deleteCharAt(i);
            k--;
        }
        while (sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}
