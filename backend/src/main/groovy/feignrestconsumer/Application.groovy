package feignrestconsumer

import feignrestconsumer.config.FeignRestConsumerConfig
import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * @author Tor Håvard Bieltvedt
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@Import([
        FeignRestConsumerConfig,
])
@Slf4j
@EnableCaching
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
class Application {

    Application() {
    }

    static void main(String[] args) throws Exception {
        SpringApplication.run Application, args
    }
}
