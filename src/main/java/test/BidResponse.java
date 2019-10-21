package test;

import java.util.List;

import lombok.Data;

/**
 * @author dongbo
 * @date 2019/1/11 16:33
 */
@Data
public class BidResponse extends BaseBidResponse{
    /**
     * 竞价请求唯一标识符
     **/
    private String id;



    private List<DspCreativeDto> creatives;
}
