package hj.weather.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heiko on 28.12.14.
 */
@Configuration
@ComponentScan(basePackages = "hj.weather.ws")
public class WSConfig {

    @Bean
    RestTemplate restTemplate() {
        RestTemplate rest = new RestTemplate();

        return rest;
    }

}
