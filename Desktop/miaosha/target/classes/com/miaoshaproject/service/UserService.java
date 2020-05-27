package com.miaoshaproject.service;


import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

import java.nio.file.Path;
import java.util.Scanner;

public interface UserService {

    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;
    /*
    telphone:用户注册的电话
    encrptPassword
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
