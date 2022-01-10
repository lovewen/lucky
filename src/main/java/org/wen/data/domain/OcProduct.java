package org.wen.data.domain;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品主表对象 oc_product
 * 
 * @author lovewen
 * @date 2022-01-09
 */
public class OcProduct
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long productId;

    /** $column.columnComment */
    private String model;

    /** $column.columnComment */
    private String sku;

    /** $column.columnComment */
    private String upc;

    /** $column.columnComment */
    private String ean;

    /** $column.columnComment */
    private String jan;

    /** $column.columnComment */
    private String isbn;

    /** $column.columnComment */
    private String mpn;

    /** $column.columnComment */
    private String location;

    /** $column.columnComment */
    private Integer quantity;

    /** $column.columnComment */
    private Long stockStatusId;

    /** $column.columnComment */
    private String image;

    /** $column.columnComment */
    private Long manufacturerId;

    /** $column.columnComment */
    private Integer shipping;

    /** $column.columnComment */
    private BigDecimal price;

    /** $column.columnComment */
    private Integer points;

    /** $column.columnComment */
    private Long taxClassId;

    /** $column.columnComment */
    private Date dateAvailable;

    /** $column.columnComment */
    private BigDecimal weight;

    /** $column.columnComment */
    private Long weightClassId;

    /** $column.columnComment */
    private BigDecimal length;

    /** $column.columnComment */
    private BigDecimal width;

    /** $column.columnComment */
    private BigDecimal height;

    /** $column.columnComment */
    private Long lengthClassId;

    /** $column.columnComment */
    private Integer subtract;

    /** $column.columnComment */
    private Long minimum;

    /** $column.columnComment */
    private Long sortOrder;

    /** $column.columnComment */
    private Integer status;

    /** $column.columnComment */
    private Integer viewed;

    /** $column.columnComment */
    private Date dateAdded;

    /** $column.columnComment */
    private Date dateModified;

    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setUpc(String upc) 
    {
        this.upc = upc;
    }

    public String getUpc() 
    {
        return upc;
    }
    public void setEan(String ean) 
    {
        this.ean = ean;
    }

    public String getEan() 
    {
        return ean;
    }
    public void setJan(String jan) 
    {
        this.jan = jan;
    }

    public String getJan() 
    {
        return jan;
    }
    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }

    public String getIsbn() 
    {
        return isbn;
    }
    public void setMpn(String mpn) 
    {
        this.mpn = mpn;
    }

    public String getMpn() 
    {
        return mpn;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setQuantity(Integer quantity) 
    {
        this.quantity = quantity;
    }

    public Integer getQuantity() 
    {
        return quantity;
    }
    public void setStockStatusId(Long stockStatusId) 
    {
        this.stockStatusId = stockStatusId;
    }

    public Long getStockStatusId() 
    {
        return stockStatusId;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setManufacturerId(Long manufacturerId) 
    {
        this.manufacturerId = manufacturerId;
    }

    public Long getManufacturerId() 
    {
        return manufacturerId;
    }
    public void setShipping(Integer shipping) 
    {
        this.shipping = shipping;
    }

    public Integer getShipping() 
    {
        return shipping;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setPoints(Integer points) 
    {
        this.points = points;
    }

    public Integer getPoints() 
    {
        return points;
    }
    public void setTaxClassId(Long taxClassId) 
    {
        this.taxClassId = taxClassId;
    }

    public Long getTaxClassId() 
    {
        return taxClassId;
    }
    public void setDateAvailable(Date dateAvailable) 
    {
        this.dateAvailable = dateAvailable;
    }

    public Date getDateAvailable() 
    {
        return dateAvailable;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
    }
    public void setWeightClassId(Long weightClassId) 
    {
        this.weightClassId = weightClassId;
    }

    public Long getWeightClassId() 
    {
        return weightClassId;
    }
    public void setLength(BigDecimal length) 
    {
        this.length = length;
    }

    public BigDecimal getLength() 
    {
        return length;
    }
    public void setWidth(BigDecimal width) 
    {
        this.width = width;
    }

    public BigDecimal getWidth() 
    {
        return width;
    }
    public void setHeight(BigDecimal height) 
    {
        this.height = height;
    }

    public BigDecimal getHeight() 
    {
        return height;
    }
    public void setLengthClassId(Long lengthClassId) 
    {
        this.lengthClassId = lengthClassId;
    }

    public Long getLengthClassId() 
    {
        return lengthClassId;
    }
    public void setSubtract(Integer subtract) 
    {
        this.subtract = subtract;
    }

    public Integer getSubtract() 
    {
        return subtract;
    }
    public void setMinimum(Long minimum) 
    {
        this.minimum = minimum;
    }

    public Long getMinimum() 
    {
        return minimum;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setViewed(Integer viewed) 
    {
        this.viewed = viewed;
    }

    public Integer getViewed() 
    {
        return viewed;
    }
    public void setDateAdded(Date dateAdded) 
    {
        this.dateAdded = dateAdded;
    }

    public Date getDateAdded() 
    {
        return dateAdded;
    }
    public void setDateModified(Date dateModified) 
    {
        this.dateModified = dateModified;
    }

    public Date getDateModified() 
    {
        return dateModified;
    }

    @Override
    public String toString() {
        return "OcProduct{" +
                "productId=" + productId +
                ", model='" + model + '\'' +
                ", sku='" + sku + '\'' +
                ", upc='" + upc + '\'' +
                ", ean='" + ean + '\'' +
                ", jan='" + jan + '\'' +
                ", isbn='" + isbn + '\'' +
                ", mpn='" + mpn + '\'' +
                ", location='" + location + '\'' +
                ", quantity=" + quantity +
                ", stockStatusId=" + stockStatusId +
                ", image='" + image + '\'' +
                ", manufacturerId=" + manufacturerId +
                ", shipping=" + shipping +
                ", price=" + price +
                ", points=" + points +
                ", taxClassId=" + taxClassId +
                ", dateAvailable=" + dateAvailable +
                ", weight=" + weight +
                ", weightClassId=" + weightClassId +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", lengthClassId=" + lengthClassId +
                ", subtract=" + subtract +
                ", minimum=" + minimum +
                ", sortOrder=" + sortOrder +
                ", status=" + status +
                ", viewed=" + viewed +
                ", dateAdded=" + dateAdded +
                ", dateModified=" + dateModified +
                '}';
    }
}
