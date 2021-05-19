package xg.service.impl;

import entity.Trade;
import entity.Trade;
import xg.dao.TradeDao;
import xg.service.TradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 交易(Trade)表服务实现类
 *
 * @author makejava
 * @since 2021-05-12 11:39:35
 */
@Service("tradeService")
public class TradeServiceImpl implements TradeService {
    @Resource
    private TradeDao tradeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Trade queryById(Integer id) {
        return this.tradeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Trade> queryAllByLimit(int offset, int limit) {
        return this.tradeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param trade 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Trade trade) {
        return  this.tradeDao.insert(trade);
    }

    /**
     * 修改数据
     *
     * @param trade 实例对象
     * @return 实例对象
     */
    @Override
    public Trade update(Trade trade) {
        this.tradeDao.update(trade);
        return this.queryById(trade.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tradeDao.deleteById(id) > 0;
    }
}