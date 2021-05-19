package entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 交易(Trade)实体类
 *
 * @author makejava
 * @since 2021-05-12 11:39:09
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trade implements Serializable {
    private static final long serialVersionUID = -82077548684378619L;
    /**
    * IID
    */
    private Integer id;
    /**
    * 订单 ID
    */
    private Integer orderId;
    /**
    * 用户 ID
    */
    private Integer userId;
    /**
    * 支付价
    */
    private Integer price;
    /**
    * 1 未付款 2 付款中 3 付款失败 4 付款完成
    */
    private Object payStatus;
    /**
    * 支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付
    */
    private Object payType;
    /**
    * 网关支付流水号
    */
    private String gatewayPayNum;
    /**
    * 网关支付时间
    */
    private Date gatewayPayTime;
    /**
    * 网关实际支付金额
    */
    private Integer gatewayPayPrice;
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

    public Trade(Integer orderId, Integer userId, Integer price, Object payStatus, Object payType, String gatewayPayNum) {
        this.orderId = orderId;
        this.userId = userId;
        this.price = price;
        this.payStatus = payStatus;
        this.payType = payType;
        this.gatewayPayNum = gatewayPayNum;
    }
//{orderId}, #{userId}, #{price}, #{payStatus}, #{payType}, #{gatewayPayNum}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Object getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Object payStatus) {
        this.payStatus = payStatus;
    }

    public Object getPayType() {
        return payType;
    }

    public void setPayType(Object payType) {
        this.payType = payType;
    }

    public String getGatewayPayNum() {
        return gatewayPayNum;
    }

    public void setGatewayPayNum(String gatewayPayNum) {
        this.gatewayPayNum = gatewayPayNum;
    }

    public Date getGatewayPayTime() {
        return gatewayPayTime;
    }

    public void setGatewayPayTime(Date gatewayPayTime) {
        this.gatewayPayTime = gatewayPayTime;
    }

    public Integer getGatewayPayPrice() {
        return gatewayPayPrice;
    }

    public void setGatewayPayPrice(Integer gatewayPayPrice) {
        this.gatewayPayPrice = gatewayPayPrice;
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