package test1;


import employee.Departmentmapper;
import employee.Employeemapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Depatement;
import pojo.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author shiyutao
 * @create 2021-11-29 22:12
 */
public class testmybatis {


@Test
    public void test2() throws IOException {
    String resource = "mybatis-comfig.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
        Employeemapper mapper = sqlSession.getMapper(Employeemapper.class);
        System.out.println(mapper.getempsif(new Employee(3, "%e%", "1", "a", null)));
        sqlSession.commit();
    }finally {
        sqlSession.close();
    }

}

}
