package com.wyz.dao;

import com.wyz.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author :wyz
 * @description:
 * @create :2022/12/29
 */

@Repository
public interface UserDao2 {
    public  List<User> selectAll();
}
