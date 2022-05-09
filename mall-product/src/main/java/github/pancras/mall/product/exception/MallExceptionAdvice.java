package github.pancras.mall.product.exception;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import github.pancras.common.exception.BizCodeEnum;
import github.pancras.common.utils.R;
import lombok.extern.slf4j.Slf4j;

/**
 * 集中处理所有异常
 *
 * @author PancrasL
 */

@Slf4j
@RestControllerAdvice(basePackages = "github.pancras.mall.product.controller")
public class MallExceptionAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验出错{}, 异常类型{}", e.getMessage(), e.getClass());
        BindingResult result = e.getBindingResult();
        Map<String, String> errMap = new HashMap<>(result.getErrorCount());
        result.getFieldErrors().forEach(error -> errMap.put(error.getField(), error.getDefaultMessage()));
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("err", errMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}
