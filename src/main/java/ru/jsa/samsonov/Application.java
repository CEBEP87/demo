package ru.jsa.samsonov;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.jsa.samsonov.config.RateLimitInterceptor;

import java.time.Duration;

@SpringBootApplication
public class Application implements WebMvcConfigurer {

    @Value("${spring.rpc}")
    private long rpc;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        Refill refill = Refill.greedy(rpc, Duration.ofSeconds(1));
        Bandwidth limit = Bandwidth.classic(rpc, refill).withInitialTokens(1);
        Bucket bucket = Bucket4j.builder().addLimit(limit).build();
        registry.addInterceptor(new RateLimitInterceptor(bucket, 1)).addPathPatterns("/api/films");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}