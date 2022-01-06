package org.wen.controller;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wen.tools.HttpTool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    @GetMapping("/test")
    public String test() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://127.0.0.1/index.php?route=api/cart/add");
        List<NameValuePair> list = new LinkedList<NameValuePair>();
        BasicNameValuePair param1 = new BasicNameValuePair("username", "admin");
        BasicNameValuePair param2 = new BasicNameValuePair("key", "FbjBuWGxklf7rMbOjY07y8Ar5TvLgGuQOEUkeCSQEwwMBpVTOgMuoVnTviyrrjsKw7nUcSSOX21WmXnggGmkSjz3LDdNYJSisZ5YSgu3LrciK4GlKj5a5EtkQJAz27Jfga8aRh61s5ItaiOGPJ4KCbseGivWV0k7Oy00clVtY5IHfkZGcQPEMZUTvHf5nOKbIKjd8CmWszEfMFNccuRGNb6fSvrryGEXXIlVOHHqxdB8Avw5YHWgHilxv1TEFJti");
        list.add(param1);
        list.add(param2);
        BasicNameValuePair param3 = new BasicNameValuePair("product_id", "28");
        BasicNameValuePair param4 = new BasicNameValuePair("quantuty", "1");
        list.add(param3);
        list.add(param4);
        UrlEncodedFormEntity entityParam = new UrlEncodedFormEntity(list, "UTF-8");
        httpPost.setEntity(entityParam);
        HttpResponse response = httpClient.execute(httpPost);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.toString());

        return "ok";
    }
}
