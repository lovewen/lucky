package org.wen.data.domain;

/**
 * 商品描述对象 oc_product_description
 * @organization coder
 * @author loveweni
 * @date 2022-01-09
 */
public class OcProductDescription
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long productId;

    /** $column.columnComment */
    private Long languageId;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private String description;

    /** $column.columnComment */
    private String tag;

    /** $column.columnComment */
    private String metaTitle;

    /** $column.columnComment */
    private String metaDescription;

    /** $column.columnComment */
    private String metaKeyword;

    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setLanguageId(Long languageId) 
    {
        this.languageId = languageId;
    }

    public Long getLanguageId() 
    {
        return languageId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setTag(String tag) 
    {
        this.tag = tag;
    }

    public String getTag() 
    {
        return tag;
    }
    public void setMetaTitle(String metaTitle) 
    {
        this.metaTitle = metaTitle;
    }

    public String getMetaTitle() 
    {
        return metaTitle;
    }
    public void setMetaDescription(String metaDescription) 
    {
        this.metaDescription = metaDescription;
    }

    public String getMetaDescription() 
    {
        return metaDescription;
    }
    public void setMetaKeyword(String metaKeyword) 
    {
        this.metaKeyword = metaKeyword;
    }

    public String getMetaKeyword() 
    {
        return metaKeyword;
    }

    @Override
    public String toString() {
        return "OcProductDescription{" +
                "productId=" + productId +
                ", languageId=" + languageId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", metaDescription='" + metaDescription + '\'' +
                ", metaKeyword='" + metaKeyword + '\'' +
                '}';
    }
}
