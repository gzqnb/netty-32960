package com.nevt.gbt32960.config;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.Objects;

@Configuration
public class CustomizerRedisCacheManager {

    @Resource
    private RedisConfig redisConfig;

    @Primary
    @Bean(name = "customCacheManager")
    public CacheManager customizerRedisCacheManager() {
        RedisTemplate<String,Object> redisTemplate = redisConfig.redisTemplateJackson();
        return new RedisCacheManager(
                RedisCacheWriter
                        .nonLockingRedisCacheWriter(Objects
                                .requireNonNull(redisTemplate
                                        .getConnectionFactory()
                                )
                        ),
                RedisCacheConfiguration
                        .defaultCacheConfig()
                        .serializeValuesWith(RedisSerializationContext
                                .fromSerializer(
                                        serializer(Object.class)
                                )
                                .getValueSerializationPair()
                        ).entryTtl(Duration.ofMinutes(30))
        );
    }

    public <T> Jackson2JsonRedisSerializer<T> serializer(Class<T> type) {
        return new Jackson2JsonRedisSerializer<>(type);
    }

}
