package xg.service;

import entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author 86176
 */
@FeignClient(value = "cloud-provider-goods",path = "/product")
public interface OrderClientService {
    @RequestMapping("/selectOne")
    public Product selectOne(@RequestParam("id") Integer id);
}
