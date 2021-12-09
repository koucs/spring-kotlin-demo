package samples.log

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class LogAspect {
    @Around("@annotation(samples.log.LogExecution)")
    fun logExecutionTime(joinPoint: ProceedingJoinPoint): Any {
        println("log start")
        val result = joinPoint.proceed()
        println("log end")
        return result
    }
}