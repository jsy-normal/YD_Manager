package com.mbvan.mbvan.common.util;

import java.lang.reflect.Field;

import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;

public class RequestUtil {
	
//	public static String getRequestIp(){
//		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getRemoteHost();
//	}
//	public static int getRequestPort(){
//		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getRemotePort();
//	}
	
	
	public static void copyNotNullField(final Object src, final Object dest) throws IllegalArgumentException {
		if (src == null) {
			throw new IllegalArgumentException("Source for field copy cannot be null");
		}
		if (dest == null) {
			throw new IllegalArgumentException("Destination for field copy cannot be null");
		}
		if (!src.getClass().isAssignableFrom(dest.getClass())) {
			throw new IllegalArgumentException("Destination class [" + dest.getClass().getName()
					+ "] must be same or subclass as source class [" + src.getClass().getName() + "]");
		}
		ReflectionUtils.doWithFields(src.getClass(), new FieldCallback() {
			public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
				ReflectionUtils.makeAccessible(field);
				Object srcValue = field.get(src);
				if(srcValue != null){
					field.set(dest, srcValue);
				}
			}
		}, ReflectionUtils.COPYABLE_FIELDS);
	}

}
