package feignrestconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import restproducer.GreetingController;

/**
 * Created by kronis on 06/04/2017.
 */
@FeignClient(name = "rest-producer", url = "http://producer:9090/my-dummy-api", fallback = GreetingClient.GreetingClientFallback.class)
public interface GreetingClient extends GreetingController {
    @Component
    public static class GreetingClientFallback implements GreetingClient {
        @Override
        public String greeting(@PathVariable("username") String username) {
            return "Hello User!";
        }
    }
}
