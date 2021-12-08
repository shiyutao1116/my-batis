package employee;


import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * @author shiyutao
 * @create 2021-12-07 16:12
 */
@Intercepts({
        @Signature(type = StatementHandler.class,method = "parameterize",args = java.sql.Statement.class)
})
public class Myplugin implements Interceptor{

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object proceed = invocation.proceed();
        return proceed;
    }

    @Override
    public Object plugin(Object o) {
        Object wrap = Plugin.wrap(o, this);
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
