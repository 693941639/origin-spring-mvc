package com.local.use.entity;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

abstract public class IterateProperties {
    public String toString() {
        try {
            BeanInfo info = Introspector.getBeanInfo(this.getClass());

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");

            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                Method method = pd.getReadMethod();

                stringBuilder.append("\"").append(pd.getName()).append("\"").append(":").append(method.invoke(this));
            }

            stringBuilder.append("}");

            return stringBuilder.toString();
        } catch (IntrospectionException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
