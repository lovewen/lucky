package org.wen.data.service;

import java.util.List;
import org.wen.data.domain.OcProduct;

/**
 * 商品主表Service接口
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
public interface IOcProductService 
{
    /**
     * 查询商品主表
     * 
     * @param productId 商品主表主键
     * @return 商品主表
     */
    public OcProduct selectOcProductByProductId(Long productId);

    /**
     * 查询商品主表列表
     * 
     * @param ocProduct 商品主表
     * @return 商品主表集合
     */
    public List<OcProduct> selectOcProductList(OcProduct ocProduct);

    /**
     * 新增商品主表
     * 
     * @param ocProduct 商品主表
     * @return 结果
     */
    public int insertOcProduct(OcProduct ocProduct);

    /**
     * 修改商品主表
     * 
     * @param ocProduct 商品主表
     * @return 结果
     */
    public int updateOcProduct(OcProduct ocProduct);

    /**
     * 批量删除商品主表
     * 
     * @param productIds 需要删除的商品主表主键集合
     * @return 结果
     */
    public int deleteOcProductByProductIds(Long[] productIds);

    /**
     * 删除商品主表信息
     * 
     * @param productId 商品主表主键
     * @return 结果
     */
    public int deleteOcProductByProductId(Long productId);
}
