package com.zto.test.example.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.zto.base.UserService;
import com.zto.base.bean.BaseResponse;
import com.zto.order.OrderOpenService;
import com.zto.test.example.util.DateUtils;

@Controller
public class TestDubbo {
	
//	@Reference(version = "1.0", timeout = 300)
//	private MessageService messageService;
	
	@Reference(group = "userService", version = "1.0.0")
    private UserService userService;
	

  @Reference
  private OrderOpenService orderService;
	
	@RequestMapping("/finduserbynickname")
	@ResponseBody
	public BaseResponse finduserbynickname(String name){
		BaseResponse<Boolean> a = userService.isNickNameExist(name);
		return this.userService.findUserByCode(name);
	}
	
	
	@RequestMapping("/openCountPreBySiteCode")
	@ResponseBody
	public String openCountPreBySiteCode(String siteCode){
		JSONObject json = new JSONObject();
	      json.put("starttime",DateUtils.getZero());
	      json.put("endtime", DateUtils.format(new Date()));
	      json.put("site", siteCode);
	      Map<String, Object> data = new HashMap<>();
	      data.put("data", json.toJSONString());
	      
		return orderService.openCountPreBySiteCode(data);
	}
	
//	
//	@RequestMapping("/test")
//	@ResponseBody
//	public ZtResponse test(){
//		return messageService.send(new SendMessageRequest());
//	}
	
	 public String testFallBack() {
	        return "hystrix fallback value";
	    }
	

}
