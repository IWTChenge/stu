package Dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    private Object tar;
    //绑定委托对象，并返回代理类
    public Object bind(Object tar){
        this.tar=tar;
        System.out.println(tar.getClass().getName());
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                tar.getClass().getInterfaces(),
                this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("代理类");
        result=method.invoke(tar,args);
        return result;
    }
}
