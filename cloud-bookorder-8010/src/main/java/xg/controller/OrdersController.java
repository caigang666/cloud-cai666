package xg.controller;

import entity.Orders;
import xg.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2021-05-12 10:39:12
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("selectAll")
    public List<Orders> selectOALL() {
        return this.ordersService.queryAllByLimit(0,100);
    }
    @RequestMapping("add")
    public String AddOrder(@RequestBody Orders orders){
        int row=ordersService.insert(orders);
        return  row>0?"添加成功":"添加失败";
    }

}