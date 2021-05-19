package xg.service;

import entity.Trade;
import java.util.List;

/**
 * 交易(Trade)表服务接口
 *
 * @author makejava
 * @since 2021-05-12 11:39:35
 */
public interface TradeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Trade queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Trade> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param trade 实例对象
     * @return 实例对象
     */
    int insert(Trade trade);

    /**
     * 修改数据
     *
     * @param trade 实例对象
     * @return 实例对象
     */
    Trade update(Trade trade);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}