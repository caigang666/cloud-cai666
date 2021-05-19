package xg.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2021-05-12 10:39:12
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = 230452436272252774L;
    
    private Integer id;
    /**
    * 产品 ID
    */
    private Integer productId;
    /**
    * 价格
    */
    private Integer price;
    /**
    * 用户账号 ID
    */
    private Integer userId;
    /**
    * 交易号 ID
    */
    private Integer tradeId;
    /**
    * 支付状态 0=未支付 1=已支付
    */
    private Object tradeStatus;
    /**
    * 删除标志，默认 0 不删除，1 删除
    */
    private Object deleted;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public Object getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Object tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}