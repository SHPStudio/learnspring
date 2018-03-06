package com.shpcoder.javaweb.controller;

import com.shpcoder.javaweb.exception.KeyIsTooLongException;
import com.shpcoder.javaweb.exception.KeyNotValidException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/7
 * Time: 11:04
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("shp", "Hello shp");
        return "home";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView processRegistration(@RequestParam("photo") MultipartFile photo) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        File output = new File("/data/spittr/");
        if (!output.exists()) {
            output.mkdir();
        }
        photo.transferTo(new File(output.getAbsolutePath() + File.separator + photo.getOriginalFilename()));
        return modelAndView;
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String find(@RequestParam("key") String key, Model model) {
        if (key.equals("222")) {
            // 如果没有做映射的话 那么直接就会报500异常
            throw new KeyNotValidException();
        }
        if (key.length() > 10) {
            // 在这里我们可以对异常统一处理
            throw new KeyIsTooLongException();
        }
        model.addAttribute("key", key);
        return "except";
    }

    @RequestMapping(value = "/findPage", method = RequestMethod.GET)
    public String findPage() {
        return "except";
    }

    /**
     * 对异常进行统一处理
     * 这样也有坏处 就是我们需要在每个类中都要写在控制器维度的异常处理
     * 我们可以用控制器通知来写全部控制器的异常处理
     */
    @ExceptionHandler(KeyIsTooLongException.class)
    public String handleKeyIsTooLongException(Model model) {
        model.addAttribute("error", "名字太长了");
        return "error";
    }

    /**
     * 使用websocket的页面
     * @return
     */
    @RequestMapping("/sock")
    public String sock() {
        return "web_socket";
    }

    @RequestMapping("/sockjs")
    public String sockjs() {
        return "sock_js";
    }

}
