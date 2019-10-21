package test;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 第三方DSP 返回的素材信息
 *
 * @author dongbo
 * @date 2019/1/11 16:34
 */
@Data
public class DspCreativeDto {

    /**
     * 创意id
     **/
    private String creativeId;

    /**
     * 出价信息
     **/
    private BigDecimal price;

    /**
     * 出价类型
     **/
    private String priceType;

    /**
     * 竞价成功回调url
     **/
    private String winNotice;

    /**
     * 点击监测链接
     **/
    private String clickTraceUrl;

    /**
     * 展示监测链接
     **/
    private String impTraceUrl;

    /**
     * 盛天专用url
     **/
    private String realWinUrl;
}
