package com.local.use.controller;

import com.local.use.entity.Test;
import com.local.use.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest")
public class RestTestController {
    @Autowired
    TestService testService;

    @GetMapping("/test/{id}")
    public Test test(@PathVariable("id") long id) {
        return testService.getTestById(id);
    }
}
