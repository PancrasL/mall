package github.pancras.common.validator;


import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author PancrasL
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {
    private final Set<Integer> set = new HashSet<>();

    /**
     * 初始化方法
     */
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for (int val : vals) {
            set.add(val);
        }
    }

    /**
     * 判断是否校验成功
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return set.contains(value);
    }
}
