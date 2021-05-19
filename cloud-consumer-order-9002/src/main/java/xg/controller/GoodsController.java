package xg.controller;

import entity.Goods;
import entity.Orders;
import entity.Product;
import entity.Trade;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xg.service.BookOrderService;
import xg.service.BookTrade2001;
import xg.service.GoodsClientService;
import xg.service.OrderClientService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2021-05-10 15:47:35
 */
@RestController
@RequestMapping("/order")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private OrderClientService goodsService;
    @Resource
    private BookOrderService bookOrderService;

    @Resource
    private BookTrade2001 bookTrade2001;
    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    /*@GetMapping("get")
    public String selectOne() {
        List<Goods> list=goodsService.selectOne();
        return "下订单成功，购买的书籍信息为："+list;
    }*/

    @RequestMapping("get/{id}")
    public String selectOne(@PathVariable Integer id) {
        Product list=goodsService.selectOne(id);
        //(Integer productId, Integer price, Integer userId, Integer tradeId, Object deleted)
        Orders orders=new Orders(list.getId(),list.getPrice(),1,new Random().nextInt()*1000,0);
        String res=bookOrderService.AddOrder(orders);
        System.err.println(res);
        if (res!=""||!res.equals("")){
            res="下单成功！！！";
            //{orderId}, #{userId}, #{price}, #{payStatus}, #{payType}, #{gatewayPayNum}
            //Trade(
            // Object payStatus, Object payType, String gatewayPayNum)
            Trade trade=new Trade(new Random().nextInt()*100+10,new Random().nextInt()*100+1,new Random().nextInt()*100+1,new Random().nextInt()*4+1,new Random().nextInt()*1000,new Random().nextInt()*100+"");
        }
        return "下订单成功，购买的商品信息为："+list+"   "+res;
    }
}