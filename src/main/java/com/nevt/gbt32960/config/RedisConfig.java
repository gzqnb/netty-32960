package com.nevt.gbt32960.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import javax.annotation.Resource;

@Configuration
public class RedisConfig {

    @Resource
    private RedisTemplate redisTemplate;

    public <T> RedisTemplate<String,T> jacksonRedisTemplate(Class<T> type) {
        Jackson2JsonRedisSerializer<T> serializer = new Jackson2JsonRedisSerializer<>(type);
        redisTemplate.setEnableDefaultSerializer(false);
        redisTemplate.setValueSerializer(serializer);
        redisTemplate.setKeySerializer(serializer);
        redisTemplate.setStringSerializer(serializer);
        redisTemplate.setHashKeySerializer(serializer);
        redisTemplate.setHashValueSerializer(serializer);
        return redisTemplate;
    }

    public RedisTemplate<String,Object> redisTemplateJackson() {
        Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<>(Object.class);
        redisTemplate.setEnableDefaultSerializer(false);
        redisTemplate.setValueSerializer(serializer);
        redisTemplate.setKeySerializer(serializer);
        redisTemplate.setStringSerializer(serializer);
        redisTemplate.setHashKeySerializer(serializer);
        redisTemplate.setHashValueSerializer(serializer);
        return redisTemplate;
    }

}
