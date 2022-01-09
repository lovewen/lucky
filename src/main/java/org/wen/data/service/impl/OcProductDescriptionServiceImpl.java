package org.wen.data.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wen.data.mapper.OcProductDescriptionMapper;
import org.wen.data.domain.OcProductDescription;
import org.wen.data.service.IOcProductDescriptionService;

/**
 * 商品描述Service业务层处理
 * 
 * @author lovewen
 * @date 2022-01-09
 */
@Service
public class OcProductDescriptionServiceImpl implements IOcProductDescriptionService 
{
    @Autowired
    private OcProductDescriptionMapper ocProductDescriptionMapper;

    /**
     * 查询商品描述
     * 
     * @param productId 商品描述主键
     * @return 商品描述
     */
    @Override
    public OcProductDescription selectOcProductDescriptionByProductId(Long productId)
    {
        return ocProductDescriptionMapper.selectOcProductDescriptionByProductId(productId);
    }

    /**
     * 查询商品描述列表
     * 
     * @param ocProductDescription 商品描述
     * @return 商品描述
     */
    @Override
    public List<OcProductDescription> selectOcProductDescriptionList(OcProductDescription ocProductDescription)
    {
        return ocProductDescriptionMapper.selectOcProductDescriptionList(ocProductDescription);
    }

    /**
     * 新增商品描述
     * 
     * @param ocProductDescription 商品描述
     * @return 结果
     */
    @Override
    public int insertOcProductDescription(OcProductDescription ocProductDescription)
    {
        return ocProductDescriptionMapper.insertOcProductDescription(ocProductDescription);
    }

    /**
     * 修改商品描述
     * 
     * @param ocProductDescription 商品描述
     * @return 结果
     */
    @Override
    public int updateOcProductDescription(OcProductDescription ocProductDescription)
    {
        return ocProductDescriptionMapper.updateOcProductDescription(ocProductDescription);
    }

    /**
     * 批量删除商品描述
     * 
     * @param productIds 需要删除的商品描述主键
     * @return 结果
     */
    @Override
    public int deleteOcProductDescriptionByProductIds(Long[] productIds)
    {
        return ocProductDescriptionMapper.deleteOcProductDescriptionByProductIds(productIds);
    }

    /**
     * 删除商品描述信息
     * 
     * @param productId 商品描述主键
     * @return 结果
     */
    @Override
    public int deleteOcProductDescriptionByProductId(Long productId)
    {
        return ocProductDescriptionMapper.deleteOcProductDescriptionByProductId(productId);
    }
}
