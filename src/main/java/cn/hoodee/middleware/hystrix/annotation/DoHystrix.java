package cn.hoodee.middleware.hystrix.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Package: cn.hoodee.middleware.hystrix.annotation
 *
 * @Description：
 * @Author: 蒋豪
 * @Date: 2022.01.21 19:43
 * @Modified By:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoHystrix {

    /**
     * 失败结果 JSON
     * @return
     */
    String returnJson() default "";

    /**
     * 超时熔断
     * @return
     */
    int timeoutValue() default 0;
}
