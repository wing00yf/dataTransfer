package com.dataTransfer.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataTransfer.dao.UserInfoMapper;
import com.dataTransfer.dto.UserDto;
import com.dataTransfer.model.UserInfo;

@Service
public class DataTransferService {
	
	@Autowired
	private UserInfoMapper userMap;
	
	
	public UserDto getUserInfo(int id){
		UserInfo user = userMap.selectByPrimaryKey(id);
		return new ModelMapper().map(user, UserDto.class);
	}

}
