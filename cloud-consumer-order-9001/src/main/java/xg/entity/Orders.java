package xg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2021-05-11 16:11:27
 */
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Orders implements Serializable {
    private static final long serialVersionUID = 376026386838337616L;
    
    private Integer id;

    public Orders(Integer productId, Integer price, Integer userId, Integer tradeId, Object deleted) {
        this.productId = productId;
        this.price = price;
        this.userId = userId;
        this.tradeId = tradeId;
        this.deleted = deleted;
    }

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

}