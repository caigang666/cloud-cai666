package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 产品信息(Product)实体类
 *
 * @author makejava
 * @since 2021-05-11 16:24:38
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = -24482214477748550L;
    
    private Integer id;
    /**
    * 产品名称
    */
    private String name;
    /**
    * 产品状态：0 待审，1 上架，2 下架，3 停售，4 测试
    */
    private Object status;
    /**
    * 产品价格 单位分
    */
    private Integer price;
    /**
    * 产品详情
    */
    private String detail;
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