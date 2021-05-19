package xg.service;

import entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 86176
 */ //@FeignClient(value = "cloud-provider-goods",path = "/goods")
public interface GoodsClientService {

    @RequestMapping("selectOne")
    public List<Goods> selectOne();
}
