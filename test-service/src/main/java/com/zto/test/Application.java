package com.zto.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zto.test.example.annotiontest.EnableLogInfo;
import com.zto.test.example.annotiontest.Market;
import com.zto.test.example.annotiontest.MyImportSelector;
import com.zto.test.example.annotiontest.Sale;
import com.zto.titans.common.annotation.EnableFramework;
import com.zto.titans.config.annotation.EnableHystrix;
import com.zto.titans.soa.dubbo.annotation.EnableDubbo;

/**
 * @EnableFramework开启Framework,类似SpringBoot的SpringBootApplication注解，封装了部分兼容性问题
 * @EnableMQ开启MQ功能模块
 * @EnableHttp开启Http模块,使用接口的方式调用Http接口
 * @EnableDubbo开启Dubbo模块，自动检测Dubbo的Service注解及Reference注解
 * @EnableMyBatis开启了Mybatis模块
 * @EnableDynamicLog开启动态日志模块及规范的日志文件及目录
 * 注意:请一定要填写应用的APP.ID,应用框架依赖此ID,生成规则请参考WIKI
 * 填写目录:src/main/resources/META-INF/app.properties
 */
@EnableFramework
@EnableDubbo
//@EnableHystrix
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		 System.out.println(context.getBean(MyImportSelector.class) != null);
//	        System.out.println(context.getBean(Market.class) != null);
//	        System.out.println(context.getBean(Sale.class) != null);
	}
}
