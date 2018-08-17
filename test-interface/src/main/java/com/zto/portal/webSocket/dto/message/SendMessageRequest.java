package com.zto.portal.webSocket.dto.message;


import java.io.Serializable;

/**
 * 发送消息入参
 */
public class SendMessageRequest implements Serializable {

    /**
     * 用户id
     */
    private int userId;

    /**
     * 消息正文
     */
    private Object body;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
    
    
}
