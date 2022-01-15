package org.wen.data.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wen.data.mapper.OcProductImageMapper;
import org.wen.data.domain.OcProductImage;
import org.wen.data.service.IOcProductImageService;

/**
 * 商品附加图片Service业务层处理
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
@Service
public class OcProductImageServiceImpl implements IOcProductImageService 
{
    @Autowired
    private OcProductImageMapper ocProductImageMapper;

    /**
     * 查询商品附加图片
     * 
     * @param productImageId 商品附加图片主键
     * @return 商品附加图片
     */
    @Override
    public OcProductImage selectOcProductImageByProductImageId(Long productImageId)
    {
        return ocProductImageMapper.selectOcProductImageByProductImageId(productImageId);
    }

    /**
     * 查询商品附加图片列表
     * 
     * @param ocProductImage 商品附加图片
     * @return 商品附加图片
     */
    @Override
    public List<OcProductImage> selectOcProductImageList(OcProductImage ocProductImage)
    {
        return ocProductImageMapper.selectOcProductImageList(ocProductImage);
    }

    /**
     * 新增商品附加图片
     * 
     * @param ocProductImage 商品附加图片
     * @return 结果
     */
    @Override
    public int insertOcProductImage(OcProductImage ocProductImage)
    {
        return ocProductImageMapper.insertOcProductImage(ocProductImage);
    }

    /**
     * 修改商品附加图片
     * 
     * @param ocProductImage 商品附加图片
     * @return 结果
     */
    @Override
    public int updateOcProductImage(OcProductImage ocProductImage)
    {
        return ocProductImageMapper.updateOcProductImage(ocProductImage);
    }

    /**
     * 批量删除商品附加图片
     * 
     * @param productImageIds 需要删除的商品附加图片主键
     * @return 结果
     */
    @Override
    public int deleteOcProductImageByProductImageIds(Long[] productImageIds)
    {
        return ocProductImageMapper.deleteOcProductImageByProductImageIds(productImageIds);
    }

    /**
     * 删除商品附加图片信息
     * 
     * @param productImageId 商品附加图片主键
     * @return 结果
     */
    @Override
    public int deleteOcProductImageByProductImageId(Long productImageId)
    {
        return ocProductImageMapper.deleteOcProductImageByProductImageId(productImageId);
    }
}
