package com.zto.test.example.annotiontest;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

public class MyImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		 System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLogInfo.class.getName()).toString().contains("onlySale"));

	        //获取自定的@EnableLogInfo 信息 如果包含 onlySale 则只注入Sales class 否则 注入 Sales 和 Market 两个类
	        if (importingClassMetadata.getAnnotationAttributes(EnableLogInfo.class.getName()) != null
	                && importingClassMetadata.getAnnotationAttributes(EnableLogInfo.class.getName()).toString().contains("onlySale")) {

	            return new String[] {Sale.class.getName() };
	        }

	        // 将指定的类
	        return new String[] { Market.class.getName(), Sale.class.getName() };
	}

}
