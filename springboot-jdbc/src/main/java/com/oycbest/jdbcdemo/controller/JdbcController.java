package com.oycbest.jdbcdemo.controller;

import com.oycbest.jdbcdemo.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author oyc
 * @Description: 用户控制类
 * @date 2018/7/8 22:10
 */
@Controller
@RequestMapping("/jdbc")
public class JdbcController {

    @Resource
    private JdbcTemplate jdbcTemplate;


    /**
     * 获取用户列表，返回json
     *
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public List<User> list() {
        String sql = "SELECT * FROM user";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            User user = null;

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setSex(rs.getString("sex"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        });
        for (User user : userList) {
            System.out.println(user.toString());
        }
        return userList;

    }

    /**
     * 获取用户列表，返回具体页面
     *
     * @param map
     * @return
     */
    @RequestMapping("/userList")
    public String userList(ModelMap map) {
        String sql = "SELECT * FROM user";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            User user = null;

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setSex(rs.getString("sex"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        });
        map.addAttribute("users", userList);
        return "user";
    }
}
