package org.wen.data.service;

import java.util.List;
import org.wen.data.domain.OcProductImage;

/**
 * 商品附加图片Service接口
 * 
 * @author lovewen
 * @date 2022-01-09
 */
public interface IOcProductImageService 
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
     * 批量删除商品附加图片
     * 
     * @param productImageIds 需要删除的商品附加图片主键集合
     * @return 结果
     */
    public int deleteOcProductImageByProductImageIds(Long[] productImageIds);

    /**
     * 删除商品附加图片信息
     * 
     * @param productImageId 商品附加图片主键
     * @return 结果
     */
    public int deleteOcProductImageByProductImageId(Long productImageId);
}
