
package com.example.azad.sample.controller ;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class TestController {

    @RequestMapping("/welcome")
    public String welcomepage() throws java.io.IOException {
        return "Welcome to RVR Tutor, host running for you is "+ InetAddress.getLocalHost().getHostName();
        // Runtime.getRuntime().exec("hostname")
    }

}
