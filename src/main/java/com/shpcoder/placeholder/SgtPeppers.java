package com.shpcoder.placeholder;

import com.shpcoder.autodi.CompactDisc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/2
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */

/**
 * @Component代表该类作为组件类 不需要显示的进行配置了 会被组件扫描扫描到
 * 如果不加一个value 那么这个组件默认的beanid就是类名的首字母小写
 */
@Component
public class SgtPeppers implements CompactDisc {

    @Value("${disc.title}")
    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    @Value("${disc.artist}")
    private String artist = "The Beatles";

    public SgtPeppers(){}

    public SgtPeppers( String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void Play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
