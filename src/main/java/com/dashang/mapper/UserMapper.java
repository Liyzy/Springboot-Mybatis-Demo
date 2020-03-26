package com.dashang.mapper;

import com.dashang.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDomain> getUser();
}
