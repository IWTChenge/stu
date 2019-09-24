package test;

import Dao.ProxyHandler;
import Dao.SubjectImpl;
import Dao.Sunbject;


public class TestProxy {
    public static void main(String[] args) {
        ProxyHandler proxy=new ProxyHandler();
        Sunbject sub=(Sunbject) proxy.bind(new SubjectImpl());
        sub.doSthing();
    }
}
