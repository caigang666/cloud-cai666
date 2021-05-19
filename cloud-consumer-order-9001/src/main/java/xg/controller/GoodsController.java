package xg.controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.*;
import xg.orderService.OrderClientService;

import javax.annotation.Resource;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2021-05-10 15:47:35
 */
@RestController
@RequestMapping("/order")
public class GoodsController {
    static final String PRE_URL="http://cloud-provider-goods";
    /**
     * 服务对象
     */
   // @Resource
   // private OrderClientService goodsService;
    @Autowired
    RestTemplate restTemplate;
    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @RequestMapping("get")
    public String selectOne() {
       String result=restTemplate.getForObject(PRE_URL+"/goods/selectOne",String.class);
       return "下订单成功，购买的书籍信息为："+result;
        //return null;
    }


}