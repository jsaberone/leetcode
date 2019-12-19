package com.leetcode.stack.q20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author zijia
 * @Desc leetcode 第20题解
 * @since 2019-12-19 8:42
 */
public class Solution {

    public static boolean isValid(String s){

        Stack stackOrder =  new Stack();
        if(s.length() % 2 == 1){
            return false;
        }

        Map<Character, Character> matchMap = new HashMap<>();
        matchMap.put('(',')');
        matchMap.put('{','}');
        matchMap.put('[',']');
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);

            if(matchMap.keySet().contains(s1)){
                stackOrder.push(s1);
            }else{
                if(!stackOrder.isEmpty()) {
                    char leftstr = (char) stackOrder.pop();
                    if (s1 != (matchMap.get(leftstr))) {
                        stackOrder.push(leftstr);
                    }
                }
            }
        }
        return stackOrder.isEmpty();
    }


    public static void main(String[] args) {

            String s0 = "){";
            String s = "{{[({}({}))]}}{}{}(){{{}}}";
            String s2 = "{{[({}([{})]}}";
            String s3 = "({)[}]";

        System.out.println(isValid(s0));
            System.out.println(isValid(s));
            System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        }
}
