package letcode;


/**
 * kmp算法:如果我们把 abbacd dcabba看成一个字符串，中间加上一个分隔符 #，abbacd#dcabba。
 * 寻找前缀和后缀相等。abba是相等，取出不相等的即可
 * <p>
 * 给定一个字符串 s，你可以通过在字符串前面添加字符将其转换为回文串。找到并返回可以用这种方式转换的最短回文串。
 * 输入: "abcd"
 * 输出: "dcbabcd"
 */
public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        String str = s + "#" + sb;
        int[] next = next(str);//next数组，求最长公共前缀数组
        String prefix = sb.substring(0, sb.length() - next[str.length()]);
        return prefix + s;
    }

    private static int[] next(String str) {
        int[] next = new int[str.length() + 1];
        next[0] = -1;
        int k = -1;
        int i = 1;
        while (i < next.length) {
            if (k == -1 || str.charAt(k) == str.charAt(i - 1)) {
                next[i++] = k++;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String s = new String("abcd");
        s = shortestPalindrome(s);
        System.out.println(s);
    }
}
