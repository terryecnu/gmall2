package com.java.gmall.index.feign;

import com.java.core.bean.Resp;
import com.java.gmall.pms.api.GmallPmsApi;
import com.java.gmall.pms.entity.Category;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient("pms-server")
public interface PmsFeign extends GmallPmsApi {

}
