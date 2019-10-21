package test;

import java.io.Serializable;

import lombok.Data;

/**
 * @author dongbo
 * @date 2019/4/2 19:50
 */
@Data
public class BaseBidResponse implements Serializable {
    /**
     * 询价请求的bean名称
     **/
    private String dspEnquiryBeanName;

    /**
     * dspUid
     **/
    private Integer dspId;

    /**
     * 是否校验
     * 斗鱼内部的广告默认为true
     * 头条为false
     **/
    private Boolean isCheck = true;
}
