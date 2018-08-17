package com.zto.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zto.portal.webSocket.dto.ZtResponse;
import com.zto.portal.webSocket.dto.message.SendMessageRequest;
import com.zto.portal.webSocket.service.MessageService;
@Service(version = "1.0",timeout = 200)
public class MessageServiceImpl implements MessageService {

	@Override
	public ZtResponse send(SendMessageRequest request) {
		ZtResponse z = new ZtResponse<>(true, "1000", "服务器返回");
		return z;
	}

}
