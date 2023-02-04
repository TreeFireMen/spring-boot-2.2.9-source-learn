package com.hand.springboot_cache;

import java.time.Duration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-04
 */
@Configuration
public class RedisConfig {
	@Bean
	public RedisCacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
		// 分别创建String和JSON格式序列化对象，对缓存数据key和value进行转换
		RedisSerializer<String> strSerializer = new StringRedisSerializer();
		Jackson2JsonRedisSerializer jacksonSerial = new Jackson2JsonRedisSerializer(Object.class);

		// 解决查询缓存转换异常的问题
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jacksonSerial.setObjectMapper(om);

		// 定制缓存数据序列化方式及时效
		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
				.entryTtl(Duration.ofDays(1)) // 缓存数据的有效期 1天
				.serializeKeysWith(RedisSerializationContext.SerializationPair
						.fromSerializer(strSerializer))  //key为String
				.serializeValuesWith(RedisSerializationContext.SerializationPair
						.fromSerializer(jacksonSerial))  //value为json
				.disableCachingNullValues();

		return RedisCacheManager.builder(redisConnectionFactory).cacheDefaults(config).build();
	}
}

