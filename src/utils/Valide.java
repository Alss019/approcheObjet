package utils;

import java.lang.reflect.Field;

import annotations.Rules;

public class Valide {
	public static void valider(Object object)
			throws ValidationException, IllegalArgumentException, IllegalAccessException {
		Class<?> o = object.getClass();
		Field[] fields = o.getDeclaredFields();

		for (Field field : fields) {
			if (field.isAnnotationPresent(Rules.class)) {
				Rules rule = field.getAnnotation(Rules.class);
				field.setAccessible(true);
				int value = field.getInt(object);
				if (value < rule.min()) {
					throw new ValidationException(field.getName() + " doit etre entre 0 et 2 147 483 647.");
				}
			}
		}
	}
}
