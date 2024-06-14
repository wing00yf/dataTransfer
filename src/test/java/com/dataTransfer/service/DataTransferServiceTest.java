package com.dataTransfer.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dataTransfer.db.test.DatabaseTestBase;
import com.dataTransfer.dto.UserDto;


@SpringBootTest
public class DataTransferServiceTest /* extends DatabaseTestBase */{
	
	@Autowired
	private DataTransferService service;
	
//	public DataTransferServiceTest() {
//		super(false,false);
//	}

	@Test
	public void getUserInfoTest() {
		UserDto dto = service.getUserInfo(2);
		Assertions.assertNotNull(dto);
		System.out.print("re:"+dto.toString());
	}
}
