package cn.hoodee.middleware.hystrix.valve;

import cn.hoodee.middleware.hystrix.annotation.DoHystrix;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * Package: cn.hoodee.middleware.hystrix.valve
 *
 * @Description：
 * @Author: 蒋豪
 * @Date: 2022.01.21 19:44
 * @Modified By:
 */
public interface IValveService {

    Object access(ProceedingJoinPoint jp, Method method, DoHystrix doHystrix, Object[] args);
}
