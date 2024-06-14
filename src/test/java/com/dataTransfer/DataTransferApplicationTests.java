package com.dataTransfer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import com.dataTransfer.dto.UserDto;
import com.dataTransfer.model.UserInfo;

@SpringBootTest
class DataTransferApplicationTests {
	
	

	@Test
	void TestUserInfo2UserDto() {
		UserInfo info = new UserInfo();
		info.setId(55);
		info.setUserName("章女士");
		info.setCity("北京");
		info.setPhoneNo("1333333333");
		info.setHouseSpace("97平米");
		UserDto dto =new ModelMapper().map(info, UserDto.class);
		Assertions.assertNotNull(dto);
		System.out.print("re:"+dto.toString());
	}


}
