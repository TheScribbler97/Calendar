package de.portfolio.calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectCheck
{
    private Logger logger = LogManager.getLogger(AspectCheck.class);
    
    @Around("execution(* de.portfolio.calendar.DAO.print())")
    public void test(ProceedingJoinPoint pjp)
    {
        logger.debug("Advice before");
        try
        {
            pjp.proceed();
        }
        catch(Throwable t)
        {
            t.printStackTrace();
        }
        logger.debug("Advice after");
    }
}
