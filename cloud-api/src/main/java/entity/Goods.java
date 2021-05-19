package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2021-05-10 15:01:52
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Goods implements Serializable {
    private static final long serialVersionUID = -83207394222147054L;
    
    private Integer id;
    
    private String gname;
    
    private Double price;

    public String port;

    public String dbsource;

}