package pers.masteryourself.tutorial.spring.framework.depend.aopcycle.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>description : LoggingAspect
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:52
 */
@Aspect
@Component
@Order(1)
public class LoggingAspect {

    @Pointcut("execution(* pers.masteryourself.tutorial.spring.framework.depend.aopcycle.bean.Dog.*(..))")
    public void declareJointPointExpression() {
    }

    @Around("declareJointPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint pjd) {
        Object result = null;
        String methodName = pjd.getSignature().getName();
        try {
            //前置通知
            System.out.println("The method " + methodName + " execute ");
            //执行目标方法
            result = pjd.proceed();
        } catch (Throwable e) {
            //异常通知
            System.out.println("The method " + methodName + " occurs exception:" + e);
            throw new RuntimeException(e);
        }
        //后置通知
        return result;
	}

}
