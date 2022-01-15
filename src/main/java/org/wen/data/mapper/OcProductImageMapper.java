package org.wen.data.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.wen.data.domain.OcProductImage;

/**
 * 商品附加图片Mapper接口
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
@Repository
public interface OcProductImageMapper 
{
    /**
     * 查询商品附加图片
     * 
     * @param productImageId 商品附加图片主键
     * @return 商品附加图片
     */
    public OcProductImage selectOcProductImageByProductImageId(Long productImageId);

    /**
     * 查询商品附加图片列表
     * 
     * @param ocProductImage 商品附加图片
     * @return 商品附加图片集合
     */
    public List<OcProductImage> selectOcProductImageList(OcProductImage ocProductImage);

    /**
     * 新增商品附加图片
     * 
     * @param ocProductImage 商品附加图片
     * @return 结果
     */
    public int insertOcProductImage(OcProductImage ocProductImage);

    /**
     * 修改商品附加图片
     * 
     * @param ocProductImage 商品附加图片
     * @return 结果
     */
    public int updateOcProductImage(OcProductImage ocProductImage);

    /**
     * 删除商品附加图片
     * 
     * @param productImageId 商品附加图片主键
     * @return 结果
     */
    public int deleteOcProductImageByProductImageId(Long productImageId);

    /**
     * 批量删除商品附加图片
     * 
     * @param productImageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOcProductImageByProductImageIds(Long[] productImageIds);
}
