package xg.controller;

import entity.Product;
import xg.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 产品信息(Product)表控制层
 *
 * @author makejava
 * @since 2021-05-11 16:27:39
 */
@RestController
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public Product selectOne(Integer id) {
        return this.productService.queryById(id);
    }

}