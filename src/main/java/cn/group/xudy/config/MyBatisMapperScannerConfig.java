package cn.group.xudy.config;

/**
 * Created by Ulegal on 2017/9/28.
 */


import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 扫描mybatis的接口
 *MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer，如果你不使用通用Mapper，可以改为org.xxx...
 * @author zxj
 *
 */
@Configuration
// 因为这个对象的扫描，需要在MyBatisConfig的后面注入，所以加上下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

        @Bean
        public MapperScannerConfigurer mapperScannerConfigurer() {
            MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
            //获取之前注入的beanName为sqlSessionFactory的对象
            mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
            //每张表对应的XXMapper.java interface类型的Java文件
            mapperScannerConfigurer.setBasePackage("cn.group.xudy.mapper");
//            Properties properties = new Properties();
//            properties.setProperty("mappers", "tk.mybatis.springboot.util.MyMapper");
//            properties.setProperty("notEmpty", "false");
//            properties.setProperty("IDENTITY", "MYSQL");
//            mapperScannerConfigurer.setProperties(properties);

            return mapperScannerConfigurer;

        }
}
