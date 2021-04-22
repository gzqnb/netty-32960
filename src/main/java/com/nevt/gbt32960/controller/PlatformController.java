package com.nevt.gbt32960.controller;

import com.nevt.gbt32960.common.result.BaseResult;
import com.nevt.gbt32960.service.PlatformService;
import com.nevt.gbt32960.util.VOUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/32960")
public class PlatformController {

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    @Resource
    private PlatformService platformService;

    @PostMapping("/one")
    public BaseResult<Object> saveOne(@RequestBody Map<String,String> data) {
        return VOUtil.VO(platformService.saveOne(data.get(USERNAME),data.get(PASSWORD)));
    }

    @GetMapping("/one")
    public BaseResult<Object> findOne(String username, String password) {
        return VOUtil.VO(platformService.findOne(username,password));
    }

}
