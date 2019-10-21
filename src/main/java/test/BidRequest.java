package test;

import java.util.List;

import lombok.Data;

/**
 * 向第三方dsp 询价请求dto
 * @author dongbo
 * @date 2019/1/11 16:19
 */
@Data
public class BidRequest {
    /**
     * 竞价请求唯一标识符
     **/
    private String id;

    /**
     * 用户信息
     **/
    private UserDto user;

    /**
     * 设备信息
     **/
    private DeviceDto device;

    /**
     * 广告位资源列表
     **/
    private List<ImpressionDto> imp;

    /**
     *  斗鱼平台信息
     **/
    private DouyuContextDto context;
}
