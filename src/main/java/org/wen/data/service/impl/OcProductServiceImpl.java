package org.wen.data.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wen.data.mapper.OcProductMapper;
import org.wen.data.domain.OcProduct;
import org.wen.data.service.IOcProductService;

/**
 * 商品主表Service业务层处理
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
@Service
public class OcProductServiceImpl implements IOcProductService 
{
    @Autowired
    private OcProductMapper ocProductMapper;

    /**
     * 查询商品主表
     * 
     * @param productId 商品主表主键
     * @return 商品主表
     */
    @Override
    public OcProduct selectOcProductByProductId(Long productId)
    {
        return ocProductMapper.selectOcProductByProductId(productId);
    }

    /**
     * 查询商品主表列表
     * 
     * @param ocProduct 商品主表
     * @return 商品主表
     */
    @Override
    public List<OcProduct> selectOcProductList(OcProduct ocProduct)
    {
        return ocProductMapper.selectOcProductByOne(ocProduct);
    }

    /**
     * 新增商品主表
     * 
     * @param ocProduct 商品主表
     * @return 结果
     */
    @Override
    public int insertOcProduct(OcProduct ocProduct)
    {
        return ocProductMapper.insertOcProduct(ocProduct);
    }

    /**
     * 修改商品主表
     * 
     * @param ocProduct 商品主表
     * @return 结果
     */
    @Override
    public int updateOcProduct(OcProduct ocProduct)
    {
        return ocProductMapper.updateOcProduct(ocProduct);
    }

    /**
     * 批量删除商品主表
     * 
     * @param productIds 需要删除的商品主表主键
     * @return 结果
     */
    @Override
    public int deleteOcProductByProductIds(Long[] productIds)
    {
        return ocProductMapper.deleteOcProductByProductIds(productIds);
    }

    /**
     * 删除商品主表信息
     * 
     * @param productId 商品主表主键
     * @return 结果
     */
    @Override
    public int deleteOcProductByProductId(Long productId)
    {
        return ocProductMapper.deleteOcProductByProductId(productId);
    }
}
