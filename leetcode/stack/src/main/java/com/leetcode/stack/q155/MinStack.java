package com.leetcode.stack.q155;

import org.springframework.jmx.export.naming.IdentityNamingStrategy;

/**
 * @author zijia
 * @Desc 最小栈
 * @since 2019-12-19 17:42
 */
public class MinStack {

    private int[] innerArray;
    private int minIndex;
    private int size;

    /** initialize your data structure here. */
    public MinStack() {
        this.innerArray = new int[8];
        this.minIndex = 0;
        this.size = 0;
    }

    public synchronized void  push(int x) {
        if(size >= innerArray.length ){
            int[] tmp = new int[innerArray.length * 2];
            System.arraycopy(innerArray, 0, tmp, 0, size);
            innerArray = tmp;
        }
        innerArray[size] = x;
        if(size == 0){
            minIndex = 0;
        }else if( x < innerArray[minIndex]){
            minIndex = size;
        }
        ++size;
    }

    public void pop() {
        --size;
        getMinIndex();
    }

    public int top() {
        return innerArray[size -1];
    }

    public int getMin() {
        return innerArray[minIndex];
    }

    public synchronized void  getMinIndex(){
        int min = innerArray[0];
        minIndex = 0;
        for(int i= 1 ; i < size; i++){
            if(innerArray[i] < min){
                min = innerArray[i];
                minIndex = i;
            }
        }
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-4);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
