## 服务治理，超时熔断
> 1、使用自定义注解和切面技术，拦截需要被熔断保护的方法。
> 2、拦截后到方法后，就可以通过 hystrix 给方法设定已配置好的超时熔断处理。