package xg.orderService;

import entity.Goods;
import entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 86176
 */
@FeignClient(value = "cloud-provider-goods",path = "/product")
public interface OrderClientService {
    /**
     * selectOne
     * @return
     */
    @RequestMapping("/selectOne")
    public Product selectOne(Integer id);
}
