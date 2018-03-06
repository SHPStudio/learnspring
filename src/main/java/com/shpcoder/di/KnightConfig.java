package com.shpcoder.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/1
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {

        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {

        return new SlayDragonQuest(System.out);
    }

}
