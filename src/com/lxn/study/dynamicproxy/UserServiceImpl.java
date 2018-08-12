package com.lxn.study.dynamicproxy;

public class UserServiceImpl implements UserService {
    @Override
    public void getName(String userId) {
        System.out.println("业务方法执行" + userId);
    }

    @Override
    public boolean getValue() {
        return Boolean.TRUE;
    }
}
