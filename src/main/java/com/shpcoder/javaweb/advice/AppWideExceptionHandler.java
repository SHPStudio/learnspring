package com.shpcoder.javaweb.advice;

import com.shpcoder.javaweb.exception.KeyIsTooLongException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 整个项目控制器进行异常处理或者一些其他的初始化工作还有加入通用的一些属性等等的功能
 * @InitBinder
 * @ModelAttribute
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/23
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */

@ControllerAdvice
public class AppWideExceptionHandler {

    /**
     * 在这里写的就能够处理所有控制器的异常了
     * @param model
     * @return
     */
    @ExceptionHandler(KeyIsTooLongException.class)
    public String handleKeyIsTooLongException(Model model) {
        model.addAttribute("error", "名字太长了");
        return "error";
    }
}
