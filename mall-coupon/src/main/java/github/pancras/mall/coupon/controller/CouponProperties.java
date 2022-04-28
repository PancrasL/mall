package github.pancras.mall.coupon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@RefreshScope
public class CouponProperties {
    @Value("${coupon.user.name}")
    private String name;
}
