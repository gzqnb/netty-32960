package com.nevt.gbt32960.service;

import com.nevt.gbt32960.config.RedisConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class RedisService {

    private static final String KEY = "PLATFORM";

    @Resource
    private RedisConfig redisConfig;

    public boolean isKey(String key, String hashKey) {
        return template().opsForHash().hasKey(key, hashKey);
    }

    public void add(String vin, int loginDaySeq) {
        template().opsForHash().put(KEY, vin, loginDaySeq);
    }

    public boolean delete(String vin, int loginDatSeq) {
        int seq = (int) template().opsForHash().get(KEY, vin);
        if (loginDatSeq == seq) {
            template().opsForHash().delete(KEY, vin);
            return true;
        } else {
            return false;
        }
    }

    private RedisTemplate<String,Object> template() {
        return redisConfig.redisTemplateJackson();
    }


}
