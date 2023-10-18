package utils;

import java.lang.reflect.Field;

import annotations.ToString;

public class StringUtils {
	public static String objectToString(Object obj) {
		Class<?> o = obj.getClass();
		StringBuilder result = new StringBuilder();

		for (Field field : o.getDeclaredFields()) {
			if (field.isAnnotationPresent(ToString.class)) {
				ToString annotation = field.getAnnotation(ToString.class);

				field.setAccessible(true);

				try {
					Object value = field.get(obj);
					if (value != null) {
						String stringValue = value.toString();
						if (value instanceof String && annotation.uppercase()) {
							stringValue = stringValue.toUpperCase();
						}
						result.append(stringValue).append(annotation.separator());
					}
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return result.toString();
	}
}