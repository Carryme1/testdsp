package test;

import lombok.Data;

/**
 * 广告创意基础dto
 *
 * @author dongbo
 * @date 2019/4/3 16:56
 */
@Data
public class BaseCreativeDto {

    private String dspEnquiryBeanName;

    /**
     * 用户标签
     */
    private String tag;
}
