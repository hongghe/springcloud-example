package com.hongghe.netfixdemo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理
 *
 * @author hongghe 04/08/2018
 */
@ControllerAdvice
public class ErrorExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorExceptionHandler.class);

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception e) {
        LOGGER.info("The exception of myself.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("helloException", e.getMessage());
        modelAndView.addObject("hello", "hello");
        modelAndView.setViewName("error/error");
        return modelAndView;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException e) {
        LOGGER.info("The runtime exception.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("helloException", e.getMessage());
        modelAndView.addObject("hongghe", "hongghe");
        modelAndView.setViewName("error/runtime");
        return modelAndView;
    }
}
