package com.shpcoder.autodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/2
 * Time: 10:49
 * To change this template use File | Settings | File Templates.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    /**
     * 如果cd没有匹配的bean 那么会报异常 那么我们需要使用requeired 改为false
     *
     * @param cd
     */
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void Play() {
        cd.Play();
    }
}
