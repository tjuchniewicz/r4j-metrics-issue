package com.example.r4jmetricsissue;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "store-one")
public interface StoreOneClient {
    @RequestMapping(method = RequestMethod.GET, value = "/stores")
    List<String> getStores();
}