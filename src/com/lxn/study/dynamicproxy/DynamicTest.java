package com.lxn.study.dynamicproxy;

import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicTest {
    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();
        UserService service = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("方法执行前");
                        Object obj = method.invoke(userService,args);
                        System.out.println("方法执行后");
                        return null;
                    }
                });
        service.getName("1234");
        service.getValue();//次处会造成空指针
    }
    @Test
    public void generateProxyClass() throws IOException {
        byte[] proxyClass = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{UserService.class});
        String path = System.getProperty("user.dir") + "/$Proxy0.class";
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(proxyClass);
    }
    @Test
    public void testBoolean(){
        boolean value = false;
        Boolean flag = value;
        System.out.println(flag.booleanValue());
    }
}
