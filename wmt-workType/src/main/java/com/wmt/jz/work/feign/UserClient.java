package com.wmt.jz.work.feign;

import com.wmt.jz.user.api.userApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "user-service")
public interface UserClient extends userApi {
}
