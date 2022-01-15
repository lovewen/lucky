package org.wen.data.domain;

/**
 * 商品附加图片对象 oc_product_image
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
public class OcProductImage
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long productImageId;

    /** $column.columnComment */
    private Long productId;

    /** $column.columnComment */
    private String image;

    /** $column.columnComment */
    private Integer sortOrder;

    public void setProductImageId(Long productImageId) 
    {
        this.productImageId = productImageId;
    }

    public Long getProductImageId() 
    {
        return productImageId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setSortOrder(Integer sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Integer getSortOrder() 
    {
        return sortOrder;
    }

    @Override
    public String toString() {
        return "OcProductImage{" +
                "productImageId=" + productImageId +
                ", productId=" + productId +
                ", image='" + image + '\'' +
                ", sortOrder=" + sortOrder +
                '}';
    }
}
