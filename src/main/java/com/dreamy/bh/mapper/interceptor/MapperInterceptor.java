package com.dreamy.bh.mapper.interceptor;

import com.dreamy.bh.domain.BaseDomain;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;


@SuppressWarnings({"rawtypes", "unchecked"})
public class MapperInterceptor implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] objs, Object object) throws Throwable {
        Class<?> entityClass = method.getDeclaringClass();

        BaseDomain domain = null;

        for (Object obj : objs) {
            if (obj instanceof BaseDomain) {
                domain = (BaseDomain) obj;
                break;
            }
        }


        if (domain != null) {
            // 数据库创建和更新时间添加
            if (method.getName().startsWith("insert")) {
                Date createdAt = domain.getCreatedAt();
                if (createdAt == null) {
                    domain.setCreatedAt(new Date());
                }
                domain.setUpdatedAt(new Date());
            } else if (method.getName().startsWith("update")) {
                domain.setUpdatedAt(new Date());
            }


        }


    }

}

