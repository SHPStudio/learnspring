package com.shpcoder.rmi;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/1
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class ShapeEntity implements Serializable{
    private String id;
    private String name;

    public ShapeEntity() {}

    public ShapeEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShapeEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
