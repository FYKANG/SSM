package cn.yk.fire.model.cms.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Author: YK
 * Title: TestVO
 * Description: 测试VO
 * Date: 2018/12/23
 * Time: 15:39
 */
@Data
public class TestVO {
    @ApiModelProperty(value = "uuid", name = "uuid", example = "", dataType = "String", required = true)
    private String uuid;
    @ApiModelProperty(value = "姓名", name = "name", example = "", dataType = "String", required = true)
    private String name;
    @ApiModelProperty(value = "性别0-男1-女", name = "sex", example = "", dataType = "Integer", required = true)
    private Integer sex;
    @ApiModelProperty(value = "手机号码", name = "phone", example = "", dataType = "String", required = true)
    private String phone;
}
