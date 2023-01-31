package com.hch.common.validation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 自定义 分类方式 验证注解
 * @author 唐知白
 * @date 2022/7/27
 */
@Documented
@Constraint(validatedBy = {CategorySchema.ShowConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CategorySchema {
    String message() default "{com.oxford.annotation.CategorySchema.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] value();

    class ShowConstraintValidator implements ConstraintValidator<CategorySchema, String> {

        private final Set<String> set = new HashSet<>();

        @Override
        public void initialize(CategorySchema constraintAnnotation) {
            String[] value = constraintAnnotation.value();
            set.addAll(Arrays.asList(value));
        }


        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            return set.contains(value);
        }
    }
}


