package com.softeem.test;

import com.softeem.entity.User;
import com.softeem.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatis_Test {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybatis_config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory=sqlSessionFactoryBuilder.build(is);
        //3.使用工厂生产SqlSession对象
        SqlSession sqlSession=sessionFactory.openSession();
        //4.使用SqlSession创建Dao接口代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //5.使用代理对象执行方法
        List<User> list=userMapper.findByUserAll();
        list.forEach(System.out::println);
        //6.释放资源
        sqlSession.close();
        is.close();
    }
}
