package cn.yk.fire.cms.aspect;

import cn.yk.fire.core.annotation.ValidateTokenPermission;
import cn.yk.fire.core.aspect.PermissionAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author: YK
 * Title: CmsPermissionAspect
 * Description: 拦截切面
 * Date: 2018/12/23
 * Time: 18:42
 */
@Component
@Aspect
@Order(2)
public class CmsPermissionAspect extends PermissionAspect {
    @Around("@annotation(validateTokenPermission)")
    public Object permissionValid(ProceedingJoinPoint joinPoint, ValidateTokenPermission validateTokenPermission) {
        return super.paramValid(joinPoint,validateTokenPermission);
    }
}
