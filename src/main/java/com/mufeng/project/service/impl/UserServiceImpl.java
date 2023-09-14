package com.mufeng.project.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.mufeng.project.model.User;
import com.mufeng.project.service.UserService;
import com.mufeng.project.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-09-14 08:16:25
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




