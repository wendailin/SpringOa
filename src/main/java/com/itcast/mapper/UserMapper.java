package com.itcast.mapper;

import com.itcast.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
     List<User> findAll();

     User findbyID(Integer id);

    void updateUser(User user);
}
