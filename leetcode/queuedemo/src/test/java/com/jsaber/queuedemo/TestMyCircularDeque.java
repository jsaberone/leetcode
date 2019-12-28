package com.jsaber.queuedemo;

import com.jsaber.queuedemo.queue.MyCircularDeque;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * @author zijia
 * @Desc 测试 MyCircularDeque 类
 * @since 2019-12-27 17:22
 */
public class TestMyCircularDeque {

    @Test
    public void test(){
        MyCircularDeque myCircularDeque = new MyCircularDeque(5);
        Assert.isTrue(myCircularDeque.insertFront(7));
        Assert.isTrue(myCircularDeque.insertLast(0));
        Assert.isTrue(myCircularDeque.getFront() == 7);
    }
}
