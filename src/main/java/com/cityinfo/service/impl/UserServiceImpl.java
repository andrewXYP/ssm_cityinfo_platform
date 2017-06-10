package com.cityinfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cityinfo.dao.UserMapper;
import com.cityinfo.dto.UserDTO;
import com.cityinfo.model.User;
import com.cityinfo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;

	public List<UserDTO> getUserList() {
		// TODO Auto-generated method stub
		List<User> userList = userMapper.getUsers();
		List<UserDTO> userDTOList = new ArrayList<UserDTO>();
		if (userList != null && !userList.isEmpty()) {
			UserDTO targe = null;
			for(User source : userList){
				targe.setUserId(source.getUserId());
				targe.setUserName(source.getUserName());
				targe.setUserPwd(source.getUserPwd());
				targe.setUserType(source.getUserType());
				userDTOList.add(targe);
			}
				
		}
		return userDTOList;
	}

}
