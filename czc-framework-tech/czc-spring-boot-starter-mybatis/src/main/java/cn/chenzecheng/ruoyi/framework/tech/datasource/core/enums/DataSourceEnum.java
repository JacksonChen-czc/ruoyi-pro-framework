package cn.chenzecheng.ruoyi.framework.tech.datasource.core.enums;

/**
 * 对应于多数据源中不同数据源配置
 * <p>
 * 通过在方法上，使用 {@link com.baomidou.dynamic.datasource.annotation.DS} 注解，设置使用的数据源。
 * 注意，默认是 {@link #MASTER} 数据源
 * <p>
 * 对应官方文档为 http://dynamic-datasource.com/guide/customize/Annotation.html
 * <p>
 * 在使用@DS注解时，有如下注意事项：
 *
 * 添加@DS注解到实现类或者实现类的方法上才可以
 * 当注解添加到类上，意味着此类里的方法都使用此数据源；
 * 当注解添加到方法上时，意味着此方法上使用的数据源优先级高于其他一切配置
 *
 * 不能使用事务，否则数据源不会切换，使用的还是第一次加载的数据源；
 * 第一次加载数据源之后，第二次、第三次…操作其它数据源，如果数据源不存在，使用的还是第一次加载的数据源；
 * 数据源名称不要包含下划线，否则不能切换。
 * https://blog.csdn.net/m0_52613676/article/details/112547174
 */
public interface DataSourceEnum {

    /**
     * 主库，推荐使用 {@link com.baomidou.dynamic.datasource.annotation.Master} 注解
     */
    String MASTER = "master";
    /**
     * 从库，推荐使用 {@link com.baomidou.dynamic.datasource.annotation.Slave} 注解
     */
    String SLAVE = "slave";

}
