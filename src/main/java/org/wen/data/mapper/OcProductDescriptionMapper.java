package org.wen.data.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.wen.data.domain.OcProductDescription;

/**
 * 商品描述Mapper接口
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
@Repository
public interface OcProductDescriptionMapper 
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
     * 删除商品描述
     * 
     * @param productId 商品描述主键
     * @return 结果
     */
    public int deleteOcProductDescriptionByProductId(Long productId);

    /**
     * 批量删除商品描述
     * 
     * @param productIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOcProductDescriptionByProductIds(Long[] productIds);
}
