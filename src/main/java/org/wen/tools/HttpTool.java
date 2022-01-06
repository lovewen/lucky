package org.wen.tools;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

/**
 * @author loveweni
 * @organization coder
 * @create 2022-01-03 20:54
 * @description HttpTool类
 */
@Service
public class HttpTool {
    public com.alibaba.fastjson.JSONObject getProduct() throws Exception{
        String appKey = "87d73a165469a7c07de19bc25778134f";
        String num_iid = "17621470828";
        String url = "https://way.jd.com/TONGLI/MDetailGetDetail";
        //创建客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //封装请求
        URIBuilder uri=new URIBuilder(url);
        uri.addParameter("num_iid",num_iid);
        uri.addParameter("appkey",appKey);
        HttpGet get = new HttpGet(uri.build());
        //执行
        HttpResponse response = httpClient.execute(get);
            if (response.getStatusLine().getStatusCode()==200){
                //格式化数据
                com.alibaba.fastjson.JSONObject content = JSON.parseObject(EntityUtils.toString(response.getEntity(), "UTF-8"));
                com.alibaba.fastjson.JSONObject result = JSON.parseObject(String.valueOf(content.get("result")));
                com.alibaba.fastjson.JSONObject ret_body = JSON.parseObject(String.valueOf(result.get("ret_body")));
                return ret_body;
            }else {
                System.out.println("请求数据失败");
                return null;
            }
    }
}
