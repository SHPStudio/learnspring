package com.shpcoder.various;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sunhaipeng
 * Date: 2018/2/5
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
@Component
public class TestDessert {
    private Dessert dessert;

    public Dessert getDessert() {
        return dessert;
    }

    /**
     * 因为在这里通过自动装配了Deesert 然而有三个类实现了dessert这样就会造成歧义会直接报错
     * 因为spring不知道应该把哪个Dessert放进来
     * 所以我们需要使用首选(primary)或者限定符(qualifier)把范围缩小到一个
     * @param dessert
     */
    @Autowired
    /**
     * 限定符 参数就是想要注入限定的beanid
     * 其实限定的是所要限定的bean是需要有一个为String类型的"iceCream"作为限定符
     * 如果没有的话就默认使用beanid beanid是跟类名挂钩的 也就是说如果我们修改了类的名字 就会报错了
     * 所以我们可以使用自定义的限定符在Component上写起一个自定义的限定符cold
     * 但是如果新建了一个Dessert也叫cold呢又有歧义了那么我们是否可以加多个@Qualifier呢 来限定只有一个
     * 肯定是不行的 因为java不允许一个类有多个限定符 java8可以只要注解带有@Repeatable注解 但是原来的注解不带有这个就没有办法了
     * 但是我们可以使用自定义的注解
     * 这样可以间接的使用多个限定符注解
     */
//    @Qualifier("cold")
    @Cold
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void test(){
        this.dessert.test();
    }
}
