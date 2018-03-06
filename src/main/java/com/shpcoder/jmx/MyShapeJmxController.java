package com.shpcoder.jmx;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/6
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
@Component
@ManagedResource(objectName = "shape:name=ShapeJmx")
public class MyShapeJmxController implements IShapeRead{

    public static final int DEFAULT_SPITTER_SIZE = 25;

    private int spittlesPerPage = DEFAULT_SPITTER_SIZE;

    @ManagedOperation
    public int getSpittlesPerPage() {
        return spittlesPerPage;
    }

    @ManagedOperation
    public void setSpittlesPerPage(int spittlesPerPage) {
        this.spittlesPerPage = spittlesPerPage;
    }

    public void readByPage() throws InterruptedException {
        while (true) {
            System.out.println("正在读取" + spittlesPerPage);
            Thread.sleep(5000);
        }
    }

    @Override
    public void read() throws InterruptedException {
        while (true) {
            System.out.println("正在从接口中读取" + spittlesPerPage);
            Thread.sleep(5000);
        }
    }
}
