/**
 * 模块manager目录，主要存放某个功能模块的通用业务处理层,它有如下特征：
 *1） 对第三方平台封装的层，预处理返回结果及转化异常信息；  
 *2） 对Service层通用能力的下沉，如缓存方案、中间件通用处理；  
 *3） 与Mapper层交互，对Mapper的业务通用能力的封装。
 * com.zto为公司目录
 * com.zto.test为项目名称
 * com.zto.test.example为模块名称
 * com.zto.test.example.manager为通用业务处理层目录
 */
package com.zto.test.example.manager;