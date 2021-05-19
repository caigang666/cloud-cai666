package xg.controller;

import entity.Trade;
import xg.service.TradeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 交易(Trade)表控制层
 *
 * @author makejava
 * @since 2021-05-12 11:39:35
 */
@RestController
@RequestMapping("trade")
public class TradeController {
    /**
     * 服务对象
     */
    @Resource
    private TradeService tradeService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public List<Trade> selectOne() {
        return this.tradeService.queryAllByLimit(0,100);
    }

    @RequestMapping("add")
    public String Addorder(@RequestBody Trade trade){
        int row=tradeService.insert(trade);
        return row>0?"添加成功":"添加成功";
    }
}