package org.wen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wen.tools.HttpTool;

/**
 * @author loveweni
 * @company: 顼龙科技
 * @date 2022/01/06 10:35:33
 * @description: 单个商品展示
 */
@RestController
public class GetProduct {

    @Autowired
    private HttpTool httpTool;

    @GetMapping("/getProduct")
    public com.alibaba.fastjson.JSONObject getProduct(ModelMap modelMap) throws Exception {
        return httpTool.getProduct();
    }
}
