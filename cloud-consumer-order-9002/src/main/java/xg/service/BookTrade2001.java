package xg.service;

import entity.Trade;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 86176
 */
@FeignClient(value ="cloud-book-trade",path = "trade")
public interface BookTrade2001 {
    @RequestMapping("selectOne")
    public List<Trade> selectOne();
    @RequestMapping("add")
    public String Addorder(@RequestBody Trade trade);
}
