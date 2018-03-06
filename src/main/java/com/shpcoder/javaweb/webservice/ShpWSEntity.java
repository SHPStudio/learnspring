package com.shpcoder.javaweb.webservice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/3/2
 * Time: 11:17
 * To change this template use File | Settings | File Templates.
 */
@Data
@AllArgsConstructor
public class ShpWSEntity implements Serializable{
    private String id;
    private String name;

    public ShpWSEntity() {}
}
