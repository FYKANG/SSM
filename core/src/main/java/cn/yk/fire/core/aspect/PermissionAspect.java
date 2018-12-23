package cn.yk.fire.core.aspect;

import cn.yk.fire.core.annotation.ValidateTokenPermission;
import cn.yk.fire.core.constant.HttpMessageConstant;
import cn.yk.fire.core.support.ResponseEntitySupport;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.http.HttpStatus;


/**
 * Author: YK
 * Title: PermissionAspect
 * Description: 错误拦截器
 * Date: 2018/12/23
 * Time: 18:29
 */
@Slf4j
public abstract class PermissionAspect {
    public Object paramValid(ProceedingJoinPoint joinPoint, ValidateTokenPermission validateTokenPermission) {
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            log.error("{}", throwable.getMessage());
            return ResponseEntitySupport.error(HttpStatus.INTERNAL_SERVER_ERROR, HttpMessageConstant.HTTP_MESSAGE_INTERNAL_SERVER_ERROR, "抛出异常");
        }
    }
}
