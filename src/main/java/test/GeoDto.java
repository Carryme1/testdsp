package test;

import lombok.Data;

/**
 * 地理位置信息dto
 * @author dongbo
 * @date 2019/1/11 16:23
 */
@Data
public class GeoDto {
    /**
     * 维度，取值范围-90.0至+90.0，负值代表南方。
     **/
    private Float lat;

    /**
     * 经度，取值范围-180.0至180.0，负值代表西方
     **/
    private Float lon;

    /**
     * 国家代码，使用ISO-3166-1-alpha-3
     **/
    private String country;

    public GeoDto(Float lat, Float lon, String country) {
        this.lat = lat;
        this.lon = lon;
        this.country = country;
    }
}
