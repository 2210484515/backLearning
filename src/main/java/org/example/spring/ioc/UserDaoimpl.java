package org.example.spring.ioc;

public class UserDaoimpl implements UserDao{
    @Override
    public void say(){
        System.out.println("userDao say hello world");
    }
}
