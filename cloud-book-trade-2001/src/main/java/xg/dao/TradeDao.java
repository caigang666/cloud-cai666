package xg.dao;

import entity.Trade;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 交易(Trade)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-12 11:39:35
 */
public interface TradeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Trade queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Trade> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param trade 实例对象
     * @return 对象列表
     */
    List<Trade> queryAll(Trade trade);

    /**
     * 新增数据
     *
     * @param trade 实例对象
     * @return 影响行数
     */
    int insert(Trade trade);

    /**
     * 修改数据
     *
     * @param trade 实例对象
     * @return 影响行数
     */
    int update(Trade trade);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}