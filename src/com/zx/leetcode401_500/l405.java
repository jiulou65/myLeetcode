package com.zx.leetcode401_500;

/**
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 *
 * 注意:
 *
 * 十六进制中所有字母(a-f)都必须是小写。
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l405 {

    public String toHexme(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer(10);
        for (int i = 7; i >= 0; i--) {
            int val = (num >> (4*i)) & 0xf;
            char temp = val < 10 ? (char) (val) : (char)((char) val -(char)(10))  ;
            sb.append(temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new l405().toHex(26);
        System.out.printf(s);
    }

    //
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 7; i >= 0; i --) {
            int val = (num >> (4 * i)) & 0xf;
            if (sb.length() > 0 || val > 0) {
                char digit = val < 10 ? (char) ('0' + val) : (char) ('a' + val - 10);
                sb.append(digit);
            }
        }
        return sb.toString();
    }

}
