给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

输入: haystack = "hello", needle = "ll"
输出: 2

示例 2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1


class StrStr {
    public int strStr(String haystack, String needle) {
        int N = haystack.length();
        int L = needle.length();
        for (int i = 0; i<N-L+1; i++){
            if (haystack.substring(i,i+L).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
