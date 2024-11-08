package com.mbvan.mbvan.common.util;

public class AssertUtil {

	public static void notNull(Object obj, String fieldName) {
		notNull(obj, fieldName, null);
	}
	
	public static void notEmpty(String input, String fieldName) {
		if(input == null || input.trim().equalsIgnoreCase("")) {
			String message = "The input parameter " + fieldName +" is required " ;
			throw new IllegalArgumentException(message);
		}
	}
	
	public static void notNull(Object obj, String fieldName, String message) {
		if(obj == null) {
			if(message == null){
				message = "The input parameter " + fieldName +" is required " ;
			}
			throw new IllegalArgumentException(message);
		}
	}
	
//	public static void notNull(String message, Object... objs) {
//		if(null != objs && objs.length > 0) {
//			for (int i = 0; i < objs.length; i++) {
//				if(null == objs[i]) {
//					throw new IllegalArgumentException(message);
//				}
//			}
//		}
//	}

	
}
