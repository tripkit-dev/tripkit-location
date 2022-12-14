package com.tripkit.lighthouse;

import com.tripkit.lighthouse.injector.GoogleProperties;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(value = {GoogleProperties.class})
public class TripkitApplication {
    public static void main(String[] args) {
        SpringApplication.run(TripkitApplication.class, args);
    }

    // Bean으로 등록하여 modelmapper를 활용할 클래스에 주입하여 사용
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public GoogleProperties googleAPI() {return new GoogleProperties();}
}
