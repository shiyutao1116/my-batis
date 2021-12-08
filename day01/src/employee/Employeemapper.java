package employee;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pojo.Employee;

import javax.naming.Name;
import java.util.List;
import java.util.Map;

/**
 * @author shiyutao
 * @create 2021-11-30 20:25
 */
public interface Employeemapper {
    public Employee getempbyid(Integer id);
    public Employee geteandd(Integer id);
    public Employee getbyid(Integer id);
    @MapKey("id")
    public Map<String,Employee>selectreturnmap1(String lastname);
    public Map<String,Object>selectreturnmap(Integer id);
    public List<Employee>selectlist(String lastName);
    public Employee selectmap(Map<String,Object> map);
    public Employee selectemployee2(@Param("id") Integer id, @Param("lastName") String Name);
    public Employee selectemployee(Integer id);
    public void  addemployee(Employee employee);
    public void  updateemployee(Employee employee);
    public void deleteemployee(Integer id);
}
