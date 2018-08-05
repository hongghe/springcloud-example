package com.hongghe.netfixdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 错误处理
 *
 * @author hongghe 04/08/2018
 */
@RestController
@RequestMapping(value = "error")
public class ErrorPageController implements ErrorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorPageController.class);

    @Override
    public String getErrorPath() {
        LOGGER.info("The path is error.");
        return "error/error";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }
}
