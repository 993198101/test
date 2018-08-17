package com.zto.portal.webSocket.dto;

import java.io.Serializable;

/**
 * 统一返回类
 *
 * @param <TResult>
 */
public class ZtResponse<TResult> implements Serializable {

    public ZtResponse(boolean status, String statusCode, String message) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
    }

    private boolean status;

    private String statusCode;

    private String message;

    private TResult result;

    public static ZtResponse success(String message) {
        return new ZtResponse(true, null, message);
    }

    public static <T> ZtResponse<T> success(String message, T result) {
        return new ZtResponse(true, null, message, result);
    }

    public static ZtResponse error(String message) {
        return new ZtResponse(false, null, message);
    }

    public static ZtResponse error(String message, String statusCode) {
        return new ZtResponse(false, statusCode, message);
    }
    

	public ZtResponse(boolean status, String statusCode, String message, TResult result) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.result = result;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TResult getResult() {
		return result;
	}

	public void setResult(TResult result) {
		this.result = result;
	}
    
}
