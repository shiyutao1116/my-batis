package test1;


import employee.Departmentmapper;
import employee.Employeemapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;
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
    public void test1() throws IOException {
        String resource = "mybatis-comfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Employeemapper mapper = sqlSession.getMapper(Employeemapper.class);
            //mapper.addemployee(new Employee(null,"song","1","qq.com"));
            //mapper.deleteemployee(2);
            //mapper.selectemployee2(1,"侍宇韬");
            /*HashMap<String, Object> map = new HashMap<>();
            map.put("id",1);
            map.put("lastName","侍宇韬");
            System.out.println(mapper.selectmap(map));*/
            // System.out.println(mapper.selectemployee(1));

            /*List<Employee> like = mapper.selectlist("%e%");
            for (Employee employee:like){
                System.out.println(employee);
            }*/
            Map<String, Employee> map = mapper.selectreturnmap1("%e%");
            System.out.println(map);
            sqlSession.commit();

        }finally {
            sqlSession.close();
        }


    }
@Test
    public void test2() throws IOException {
    String resource = "mybatis-comfig.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
        Employeemapper mapper = sqlSession.getMapper(Employeemapper.class);
//        System.out.println(mapper.getbyid(1));
//        System.out.println(mapper.geteandd(1));
//        System.out.println(mapper.geteandd(1).getDepatement());
//        sqlSession.commit();
        System.out.println(mapper.getempbyid(1));
        System.out.println(mapper.getempbyid(1).getDepatement());
    }finally {
        sqlSession.close();
    }

}

}
