package com.ditoro.demoinfrastructure.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/service-b")
public class ServiceBController {

    @GetMapping("/")
    public String routeA() {
        log.info("Service B - Route B");
        return "Service B - Route B";
    }

}
