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
import sun.security.provider.certpath.OCSP;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author loveweni
 * @company: 顼龙科技
 * @date 2022/01/09 10:31:53
 * @description: 执行商品插入数据库
 */
public class Business {

    @Autowired
    private OcProductServiceImpl productService = new OcProductServiceImpl();
    @Autowired
    private OcProductDescriptionServiceImpl descriptionService = new OcProductDescriptionServiceImpl();
    @Autowired
    private OcProductImageServiceImpl imageService = new OcProductImageServiceImpl();

    /**
     * 声明实体类信息
     */
    OcProduct ocProduct;
    OcProductDescription ocProductDescription;
    OcProductImage ocProductImage;

    public String execute() throws Exception{
        //1. 获取并解析参数
        //JSONObject param = new HttpTool().getProduct();
        //2. 封装product实体类和description实体类和image实体类
        ocProduct = new OcProduct();
        ocProductDescription = new OcProductDescription();
        ocProductImage = new OcProductImage();

        /**
         * 对商品表的封装
         */
        ocProduct.setModel("商品名称");//商品名称
        ocProduct.setSku("17");//库存
        ocProduct.setUpc("1");
        ocProduct.setEan("1");
        ocProduct.setJan("1");
        ocProduct.setIsbn("1");
        ocProduct.setMpn("1");
        ocProduct.setLocation("1");
        ocProduct.setQuantity(new Integer("15"));
        ocProduct.setStockStatusId(1L);
        ocProduct.setImage("https://img2.baidu.com/it/u=1970005619,2283568274&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=779");//商品图片
        ocProduct.setManufacturerId(1L);
        ocProduct.setShipping(new Integer("15"));
        ocProduct.setPrice(new BigDecimal("15.22"));
        ocProduct.setPoints(new Integer("15"));
        ocProduct.setTaxClassId(1L);
        ocProduct.setDateAvailable(new Date());
        ocProduct.setWeight(new BigDecimal("15.88"));
        ocProduct.setWeightClassId(1L);
        ocProduct.setLength(new BigDecimal("15.01"));
        ocProduct.setWidth(new BigDecimal("15.21"));
        ocProduct.setHeight(new BigDecimal("15.23"));
        ocProduct.setLengthClassId(1L);
        ocProduct.setSubtract(new Integer("1"));
        ocProduct.setMinimum(1L);
        ocProduct.setMinimum(1L);
        ocProduct.setSortOrder(1L);
        ocProduct.setStatus(new Integer("1"));
        ocProduct.setViewed(new Integer("1"));
        ocProduct.setDateAdded(new Date());
        ocProduct.setDateModified(new Date());

        /**
         * 对商品描述的封装
         */
        ocProductDescription.setName("哇哈哈");
        ocProductDescription.setDescription("测试商品数据");
        ocProductDescription.setTag("1");
        ocProductDescription.setMetaTitle("1");
        ocProductDescription.setMetaDescription("1");
        ocProductDescription.setMetaKeyword("1");

        /**
         * 对商品图片的封装
         */
        ocProductImage.setImage("https://img2.baidu.com/it/u=1970005619,2283568274&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=779");
        ocProductImage.setSortOrder(new Integer("1"));



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
                if (i1<=0 && i2<=0){throw new Exception("商品描述信息或商品图片插入失败");}
                return "执行完毕, 数据插入成功";
            }
            throw new Exception("无法查询到商品信息, 请检查");
        }
        throw new Exception("product 插入失败");
    }

    public static void main(String[] args) throws Exception{
        System.out.println("开始");
        new Business().execute();
        System.out.println("结束");
    }




}
