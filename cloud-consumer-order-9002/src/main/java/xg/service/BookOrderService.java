package xg.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.Orders;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 86176
 */
@FeignClient(value = "cloud-bookorder-order",path = "orders")
public interface BookOrderService {
    @RequestMapping("add")
    public String AddOrder(@RequestBody Orders orders);
}
