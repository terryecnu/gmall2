package com.java.gmall.item.feign;

import com.java.gmall.sms.api.GmallSmsApi;
import com.java.gmall.wms.api.WmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jiangli
 * @since 2020/1/26 15:01
 */
@FeignClient("wms-server")
public interface WmsFeign extends WmsApi {
}
