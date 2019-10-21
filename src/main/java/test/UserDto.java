package test;

import lombok.Data;

/**
 * 询价第三方用户信息dto
 * @author dongbo
 * @date 2019/1/11 16:20
 */
@Data
public class UserDto {
    /**
     * 年龄
     **/
    private Integer age;

    /**
     * 性别
     **/
    private Integer sex;

    /**
     * 用户标签
     **/
    private String label;

    /**
     * 地域 - 发展划分
     */
    private Integer residentCity;

    /**
     * 地域 - 地理划分
     */
    private Integer residentProvince;

    /**
     * 网络环境
     */
    private Integer network;
}
