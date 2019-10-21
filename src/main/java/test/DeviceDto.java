package test;

import lombok.Data;

/**
 * 请求第三方询价 的用户设备信息
 * @author dongbo
 * @date 2019/1/11 16:22
 */
@Data
public class DeviceDto {
    /**
     * 设备的IPv4地址
     **/
    private String ip;
    /**
     * 设备的IPv6地址
     **/
    private String ipv6;
    /**
     * 设备的操作系统，值：IOS、Android、Other（注意大小）
     **/
    private String os;
    /**
     * 设备操作系统版本（如”3.1.2“）
     **/
    private String osv;
    /**
     * 设备的硬件版本（如iPhone 5S的5S)
     **/
    private String hwv;
    /**
     * 用户当前的位置，见geo对象
     **/
    private GeoDto geo;

    /**
     * 网络服务提供商MCC+MNC（如46000代表中国移动，参https://en.wikipedia.org/wiki/Mobile_country_code）
     **/
    private String carrier;

    /**
     *   网络连接类型。
     *   0：未知
     *   1：以太网
     *   2： WIFI
     *   3： 蜂窝网--第几代未知
     *   4： 2G
     *   5： 3G
     *   6： 4G
     **/
    private Integer connectiontype;

    /**
     * useragent字符串
     **/
    private String ua;

    /**
     * 安卓设备的imei号，明文
     **/
    private String imei;

    /**
     * IOS6.0及以上的idfa号，明文
     **/
    private String idfa;

    /**
     * 设备屏幕尺寸：高 如 640
     **/
    private Integer h;

    /**
     * 设备屏幕尺寸：宽 如 480
     **/
    private Integer w;

    /**
     * 设备型号(3.56新增)
     **/
    private String model;

    /**
     * 安卓设备androidid;
     **/
    private String addid;

}
