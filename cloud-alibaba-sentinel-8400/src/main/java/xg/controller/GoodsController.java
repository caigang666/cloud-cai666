package xg.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    @RequestMapping("/getGoodsAll")
    @SentinelResource(value = "getGoodsAll", blockHandler = "getG")
    public String getGoodsAll() {
        return "返回所有商品信息...";
    }

    public String getG() {
        return "返回所有商品信息的兜底...";
    }

    @RequestMapping("/getGoodsfallback")
    @SentinelResource(value = "getGoodsfallback", blockHandler = "getGoods_block")
    public String getGoods(String id, String name) {
        return "获取单个商品信息...";
    }

    public String getGoods_block(String id, String name, BlockException e) {
        return "获取单个商品信息...getGoods_block兜底";
    }

    @RequestMapping("/getGoods")
    @SentinelResource(value = "getGoods", fallback = "getGoodsError")
    public String getGoods(String id) {
        if ("4".equals(id)) {
            throw new NullPointerException();
        }
        return "效果演示2: fallback,设置降级规则获取单个商品信息  getGoods...";
    }

    public String getGoodsError(String id) {
        return "效果演示2: fallback,设置降级规则异常兜底方法";
    }
}

