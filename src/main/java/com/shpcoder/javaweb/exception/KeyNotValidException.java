package com.shpcoder.javaweb.exception;

/**
 * 自定义异常
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/23
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 我们可以做一个映射 把我们的这个错误作为404来算
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "key值没有找到")
public class KeyNotValidException extends RuntimeException{
}
