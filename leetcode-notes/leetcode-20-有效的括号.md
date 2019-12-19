### 20.有效的括号（valid parentheses）

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

1. 左括号必须用相同类型的右括号闭合。
2. 左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。

示例 1:
```
输入: "()"
输出: true
```
示例 2:
```
输入: "()[]{}"
输出: true
```
示例 3:
```
输入: "(]"
输出: false
```

### 解析
这是一道经典的使用 栈 来解决的题目。分析有可以把括号分为开，闭；其中的开 push 到栈中，然后往后继续遍历的过程中，找出与开对应的闭，当栈中的元素为零即是符合的。
[官方解答](https://leetcode-cn.com/problems/valid-parentheses/solution/you-xiao-de-gua-hao-by-leetcode)



### 代码--java
```java
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
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
}
```