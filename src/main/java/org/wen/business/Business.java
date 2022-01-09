package org.wen.business;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.wen.data.domain.OcProduct;
import org.wen.data.domain.OcProductDescription;
import org.wen.data.domain.OcProductImage;
import org.wen.data.service.impl.OcProductDescriptionServiceImpl;
import org.wen.data.service.impl.OcProductImageServiceImpl;
import org.wen.data.service.impl.OcProductServiceImpl;
import org.wen.tools.HttpTool;

import java.util.List;

/**
 * @author loveweni
 * @company: 顼龙科技
 * @date 2022/01/09 10:31:53
 * @description: description
 */
public class Business {

    @Autowired
    private HttpTool httpTool;
    @Autowired
    private OcProductServiceImpl productService;
    @Autowired
    private OcProductDescriptionServiceImpl descriptionService;
    @Autowired
    private OcProductImageServiceImpl imageService;

    /**
     * 声明实体类信息
     */
    OcProduct ocProduct;
    OcProductDescription ocProductDescription;
    OcProductImage ocProductImage;



    public String execute() throws Exception{
        //1. 获取并解析参数
        JSONObject param = httpTool.getProduct();
        //2. 封装product实体类和description实体类和image实体类
        ocProduct = new OcProduct();
        ocProductDescription = new OcProductDescription();
        ocProductImage = new OcProductImage();

        //3. 插入product表
        int i = productService.insertOcProduct(ocProduct);
        if (i>0){
            //插入成功
            //4. 根据ocProduct实体类查询productId
            List<OcProduct> ocProducts = productService.selectOcProductList(ocProduct);
            if (ocProducts.size()>0){
                //有数据
                //5. 将productId插入到ocProductDescription、ocProductImage实体类中;
                ocProductDescription.setProductId(ocProducts.get(0).getProductId());
                ocProductImage.setProductId(ocProducts.get(0).getProductId());
                //6. 执行插入
                int i1 = descriptionService.insertOcProductDescription(ocProductDescription);
                int i2 = imageService.insertOcProductImage(ocProductImage);
                if (i1<=0 && i2<=0){return "商品描述信息或商品图片插入失败";}
                return "执行完毕, 数据插入成功";
            }
            return "无法查询到商品信息, 请检查";
        }
        return "product 插入失败";
    }

    public static void main(String[] args) throws Exception{
        System.out.println("开始");
        new Business().execute();
        System.out.println("结束");
    }




}
