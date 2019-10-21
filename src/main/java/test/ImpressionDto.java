package test;

import lombok.Data;

/**
 * @author dongbo
 * @date 2019/1/11 16:31
 */
@Data
public class ImpressionDto {

    /**
     * 资源位底价 广告位cpm低价
     **/
    private Long bidfloor;

    /**
     * 客户端类型
     **/
    private Integer clientType;

    /**
     * 资源位code（广告位code）
     **/
    private String id;
    /**
     * 资源位计算币种
     **/
    private String bidfloorcur;

    /**
     * 广告位分辨率
     **/
    private String posResolution;
}
