package com.zto.portal.webSocket.service;

import com.zto.portal.webSocket.dto.ZtResponse;
import com.zto.portal.webSocket.dto.message.SendMessageRequest;

/**
 * 消息服务
 */
public interface MessageService {

    /**
     * 发送消息
     */
    ZtResponse send(SendMessageRequest request);
}
