package com.zto.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import com.zto.titans.common.annotation.EnableFramework;
import com.zto.titans.common.startup.Main;
import com.zto.titans.soa.dubbo.annotation.EnableDubbo;

/**
 * Hello world!
 *
 */
@EnableFramework
@EnableDubbo
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
