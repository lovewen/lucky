package org.wen.tools;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.URISyntaxException;

/**
 * @author loveweni
 * @organization coder
 * @create 2022-01-03 20:54
 * @description 测试API接口类
 */
public class HttpTool {
    public static void main(String[] args) throws URISyntaxException {
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
        try {
            HttpResponse response = httpClient.execute(get);
            //格式化数据
            String content = EntityUtils.toString(response.getEntity(), "UTF-8");

            System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(content);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
