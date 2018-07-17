package com.problems.demo.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//一个简单的测试,你可以通过localhost:8080/helloworld访问
@RestController
public class ThisWillActuallyRun {
    @RequestMapping("/helloworld")
    String home() {
        return "Hello World!";
    }
}
