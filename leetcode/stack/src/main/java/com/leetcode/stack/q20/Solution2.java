package com.leetcode.stack.q20;

/**
 * @author zijia
 * @Desc leetcode 第20题-方法2
 * @since 2019-12-19 8:53
 */
public class Solution2 {

    public static boolean isValid(String s) {
        while(s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replaceAll("\\(\\)","");
            s = s.replaceAll("\\[\\]","");
            s = s.replaceAll("\\{\\}","");
        }
        return s.length() == 0;
    }


    public static void main(String[] args) {

        String s = "{{[({}({}))]}}";
        String s2 = "{{[({}([{})]}}";

        System.out.println(isValid(s));
        System.out.println(isValid(s2));
    }
}
