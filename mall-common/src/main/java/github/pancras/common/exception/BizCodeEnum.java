package github.pancras.common.exception;

/**
 * @author PancrasL
 */
public enum BizCodeEnum {
    /**
     * 参数格式校验失败
     */
    VALID_EXCEPTION(10001, "参数格式校验失败"),
    /**
     * 发送验证码太频繁,请稍后再试
     */
    SMS_CODE_EXCEPTION(10002, "发送验证码太频繁,请稍后再试"),
    /**
     * 请求流量过大
     */
    TOO_MANY_REQUEST(10003, "请求流量过大"),
    /**
     * 系统未知异常
     */
    UNKNOW_EXCEPTION(10000, "系统未知异常"),
    /**
     * 商品上架异常
     */
    PRODUCT_UP_EXCEPTION(11000, "商品上架异常"),
    /**
     * 用户已存在
     */
    USER_EXIST_EXCEPTION(15001, "用户已存在"),
    /**
     * 手机号码已存在
     */
    PHONE_EXIST_EXCEPTION(15002, "手机号码已存在"),
    /**
     * 未输入手机号码
     */
    PHONE_NULL_EXCEPTION(15003, "未输入手机号码"),
    /**
     * 商品库存不足
     */
    NO_STOCK_EXCEPTION(21000, "商品库存不足"),
    /**
     * 账号或密码错误
     */
    LOGINACCT_PASSWORD_INVAILD_EXCEPTION(15002, "账号或密码错误");

    private final int code;
    private final String msg;

    BizCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
