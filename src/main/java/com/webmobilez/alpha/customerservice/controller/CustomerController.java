package com.webmobilez.alpha.customerservice.controller;

import com.webmobilez.alpha.customerservice.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/hello")
public class CustomerController {

    @Autowired
    private Environment environment;
    @GetMapping(value = "/v1/greeting")
    public ResponseEntity<String> sayHello() throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        return ResponseEntity.ok("Hello from "+ ip + " and port " + environment.getProperty("local.server.port") + " and hostname - " + environment.getProperty("java.rmi.server.hostname"));
    }
}

