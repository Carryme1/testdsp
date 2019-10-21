package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lifengqiang
 * @date 2019/10/11
 */
@Slf4j
@RestController
@RequestMapping("/test/smooth")
public class TestDspController {

    @PostMapping
    public BidResponse test(BidRequest request) {
        System.out.println(request);
        BidResponse bidResponse = new BidResponse();
        bidResponse.setId("1214");
        List<DspCreativeDto> creatives = new ArrayList<DspCreativeDto>();
        DspCreativeDto dto = new DspCreativeDto();
        dto.setClickTraceUrl("http://wwww.douyuClick.com#AND#http://wwww.douyuClick1.com?requestId=[[_REQUESTID_]]&creativeId=[[_CREATIVEID_]]&price=[[_PRICE_]]&winPrice=[[_WINPRICE_]]");
        dto.setImpTraceUrl("http://www.douyuImpTrace.com#AND#http://www.douyuImpTrace1.com?requestId=[[_REQUESTID_]]&creativeId=[[_CREATIVEID_]]&price=[[_PRICE_]]&winPrice=[[_WINPRICE_]]");
        dto.setPrice(BigDecimal.valueOf(100000000));
        dto.setPriceType("0");
        dto.setCreativeId("378");
        creatives.add(dto);
        bidResponse.setCreatives(creatives);
        return bidResponse;
    }

}
