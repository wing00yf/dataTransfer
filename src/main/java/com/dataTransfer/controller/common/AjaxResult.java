package com.dataTransfer.controller.common;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@Schema(description = "响应对象")
public class AjaxResult{
	
	 public static final int SUCCESS = 200;
	 public static final int ERROR = 500;

	@Schema(
            title = "code",
            description = "响应码",
            format = "int32",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Integer code;

    @Schema(
            title = "msg",
            description = "响应信息",
            accessMode = Schema.AccessMode.READ_ONLY,
            example = "成功或失败",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String msg;

    @Schema(title = "data", description = "响应数据", accessMode = Schema.AccessMode.READ_ONLY)
    private Object data;
    
    
    private AjaxResult(int code, String msg) {
    	this.code = code;
    	this.msg = msg;
    }
 
    private AjaxResult(int code, String msg, Object data) {
    	this.code = code;
    	this.msg = msg;
    	this.data = data;
    }
    
    public static AjaxResult successs(String msg, Object data) {
    	return new AjaxResult(SUCCESS, msg, data);
    }
    
    public static AjaxResult successs() {
    	return successs("success");
    }
    
    public static AjaxResult successs(String msg) {
    	return successs(msg, null);
    }
    
    public static AjaxResult successs(Object data) {
    	return successs("success", data);
    }
    
    public static AjaxResult error(String msg, Object data)
    {
        return new AjaxResult(ERROR, msg, data);
    }
    
    public static AjaxResult error(String msg)
    {
        return error(msg, null);
    }
    
    public static AjaxResult error()
    {
        return error("failure");
    }
		
}
