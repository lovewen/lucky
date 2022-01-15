package org.wen.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

/**
 * @author loveweni
 * @organization coder
 * @create 2022-01-03 20:54
 * @description api获取工具类
 */
@Component
public class HttpTool {
    public JSONObject getProduct() throws Exception{
        /**
         * 配置api请求参数
         */
        String appKey = "87d73a165469a7c07de19bc25778134f";
        String num_iid = "17621470828";
        String url = "https://way.jd.com/TONGLI/MDetailGetDetail";
        //1. 创建客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2. 封装请求
        URIBuilder uri=new URIBuilder(url);
        uri.addParameter("num_iid",num_iid);
        uri.addParameter("appkey",appKey);
        HttpGet get = new HttpGet(uri.build());
        //3. 执行
        HttpResponse response = httpClient.execute(get);
            if (response.getStatusLine().getStatusCode()==200){
                //4. 格式化result数据并返回
                JSONObject content = JSON.parseObject(EntityUtils.toString(response.getEntity(), "UTF-8"));
                JSONObject result = JSON.parseObject(String.valueOf(content.get("result")));
                JSONObject ret_body = JSON.parseObject(String.valueOf(result.get("ret_body")));
                return ret_body;
            }else {
                throw new Exception("api获取数据失败");
            }
    }
}
