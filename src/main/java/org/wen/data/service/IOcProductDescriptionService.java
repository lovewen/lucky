package org.wen.data.service;

import java.util.List;
import org.wen.data.domain.OcProductDescription;

/**
 * 商品描述Service接口
 * 
 * @author lovewen
 * @date 2022-01-09
 */
public interface IOcProductDescriptionService 
{
    /**
     * 查询商品描述
     * 
     * @param productId 商品描述主键
     * @return 商品描述
     */
    public OcProductDescription selectOcProductDescriptionByProductId(Long productId);

    /**
     * 查询商品描述列表
     * 
     * @param ocProductDescription 商品描述
     * @return 商品描述集合
     */
    public List<OcProductDescription> selectOcProductDescriptionList(OcProductDescription ocProductDescription);

    /**
     * 新增商品描述
     * 
     * @param ocProductDescription 商品描述
     * @return 结果
     */
    public int insertOcProductDescription(OcProductDescription ocProductDescription);

    /**
     * 修改商品描述
     * 
     * @param ocProductDescription 商品描述
     * @return 结果
     */
    public int updateOcProductDescription(OcProductDescription ocProductDescription);

    /**
     * 批量删除商品描述
     * 
     * @param productIds 需要删除的商品描述主键集合
     * @return 结果
     */
    public int deleteOcProductDescriptionByProductIds(Long[] productIds);

    /**
     * 删除商品描述信息
     * 
     * @param productId 商品描述主键
     * @return 结果
     */
    public int deleteOcProductDescriptionByProductId(Long productId);
}
