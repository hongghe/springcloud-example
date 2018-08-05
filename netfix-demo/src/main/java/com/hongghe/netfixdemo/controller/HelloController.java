package com.hongghe.netfixdemo.controller;

import com.hongghe.netfixdemo.domain.ApiConstant;
import com.hongghe.netfixdemo.domain.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 样例页面
 *
 * @author hongghe 04/08/2018
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("")
    public String home() {
        LOGGER.info("The hello");
        return "Hello World";
    }

    @RequestMapping("demo")
    public ApiResult runtimeException(Model model) throws Exception {
        model.addAttribute("hello", "hello");
        if (true) {
            throw new Exception("Not run time exception.");
        }

        if (true) {
            throw new RuntimeException("The run time exception.");
        }

        return new ApiResult(ApiConstant.SUCCESS);
    }
}
