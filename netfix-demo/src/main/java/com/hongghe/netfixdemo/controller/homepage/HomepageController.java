package com.hongghe.netfixdemo.controller.homepage;

import com.hongghe.netfixdemo.domain.ApiConstant;
import com.hongghe.netfixdemo.domain.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页的控制器
 *
 * @author hongghe 04/08/2018
 */
@RestController
@RequestMapping(value = "home")
public class HomepageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomepageController.class);

    @RequestMapping(value = "")
    public ApiResult home() {
        ApiResult apiResult = new ApiResult(ApiConstant.SUCCESS);
        return apiResult;
    }
}
