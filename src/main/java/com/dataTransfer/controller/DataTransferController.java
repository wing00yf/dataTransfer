package com.dataTransfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataTransfer.controller.common.AjaxResult;
import com.dataTransfer.dto.UserDto;
import com.dataTransfer.service.DataTransferService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.*;

@RestController
@RequestMapping("/user")
@Tag(name = "DataTransferControllerAPI", description = "用户信息")
public class DataTransferController{
	
	@Autowired
	private DataTransferService service;
	
    @Operation(summary = "获取用户信息", 
    		parameters = {@Parameter(name="id", description="用户ID",required = true)}, 
    		responses = {
    				@ApiResponse( responseCode = "200", 
    							  description = "响应成功", 
    							  content = @Content( mediaType = "application/json", 
    											     schema = @Schema(title = "AjaxResult和UserInfoDto", 
    															      description ="返回实体和UserInfoDto",
    															      anyOf = {AjaxResult.class, UserDto.class}))),
    				@ApiResponse( responseCode = "400", 
    							  description = "响应失败", 
    							  content = @Content( mediaType = "application/json", 
    												  schema = @Schema(title = "AjaxResult模型", 
    												  				   description ="AjaxResult和data为空",
    												  					anyOf = AjaxResult.class)))})
    @GetMapping("/getUser/{id}")
	public AjaxResult getUser(@PathVariable(value = "id")int id){
		UserDto info =  service.getUserInfo(id);
		AjaxResult d =AjaxResult.successs(info);
		return d;
	}
	
}