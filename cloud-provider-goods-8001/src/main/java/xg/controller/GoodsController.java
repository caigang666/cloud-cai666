package xg.controller;

import entity.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import xg.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2021-05-10 15:08:27
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;
    @Value("${spring.application.name}")
    String serverName;
    @Value("${server.port}")
    String port;
    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public List<Goods> selectOne() {
        List<Goods> list=this.goodsService.queryAllByLimit(0,100);
        for (Goods g: list) {
            if (g.getPort()==null||g.getPort()==""){
                g.setPort(port);
            }
            if (g.getDbsource()==null||g.getDbsource()==""){
                g.setDbsource(serverName);
            }
        }
        return list;
    }

}