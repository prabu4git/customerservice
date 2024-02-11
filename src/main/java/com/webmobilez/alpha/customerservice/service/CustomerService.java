package com.webmobilez.alpha.customerservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class CustomerService {

    @Bean
    public Consumer<String> createVendorRecord() {
        return (vendor) -> {
            log.info("Received the message {} in consumer", vendor);
        };
    }
}
