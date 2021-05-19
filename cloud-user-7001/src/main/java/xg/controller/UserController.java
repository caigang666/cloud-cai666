package xg.controller;

import xg.entity.User;
import xg.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(User)表控制层
 *
 * @author makejava
 * @since 2021-05-11 15:04:09
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public List<User> selectOne() {
        //return this.userService.queryAll(new User("admin","admin"));
        return userService.queryAllByLimit(0,100);
    }

}