package github.pancras.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import org.hibernate.validator.constraints.URL;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

import github.pancras.common.validator.group.AddGroup;
import github.pancras.common.validator.ListValue;
import github.pancras.common.validator.group.UpdateGroup;
import github.pancras.common.validator.group.UpdateStatusGroup;
import lombok.Data;

/**
 * 品牌
 *
 * @author Pancras
 * @email sunlightcs@gmail.com
 * @date 2022-04-27 16:05:39
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 品牌id
     */
    @NotNull(message = "修改必须指定Id",groups = {UpdateGroup.class})
    @Null(message = "新增不能指定Id",groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotEmpty(message="品牌名不能为空",groups = {UpdateGroup.class,AddGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotEmpty(groups = {AddGroup.class})
    @URL(message = "logo必须是一个合法的URL地址",groups = {UpdateGroup.class,AddGroup.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
    @ListValue(vals = {0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty(groups = {AddGroup.class})
    @Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须是一个字母",groups = {AddGroup.class,UpdateGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups = {AddGroup.class})
    @Min(value = 0,message = "排序必须大于等于0")
    private Integer sort;
}
