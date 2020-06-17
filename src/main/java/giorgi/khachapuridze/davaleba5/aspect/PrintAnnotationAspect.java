package giorgi.khachapuridze.davaleba5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(giorgi.khachapuridze.davaleba5.aspect.Println )")
    public void printLog(JoinPoint joinPoint){
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }
}



