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
    public List<Employee> getempsif(Employee employee);
    public List<Employee> getempschoose(Employee employee);
    public void update(Employee employee);
    public List<Employee> getempsforeach(@Param("ids") List<Integer> ids);
    public  void addemps(@Param("emps") List<Employee> emps);
}
