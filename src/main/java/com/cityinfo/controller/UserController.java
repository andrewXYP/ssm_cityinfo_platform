package com.cityinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cityinfo.dto.Result;
import com.cityinfo.dto.UserDTO;
import com.cityinfo.enums.ErrorCodeEnum;
import com.cityinfo.service.UserService;

@Controller
@RequestMapping(value="/aaa")
public class UserController extends BaseController {

	@Resource(name="userService")
	UserService userService;
	
	@RequestMapping(value = "/allUser")
	@ResponseBody
	public Result getUserList(){
		List<UserDTO> userList = userService.getUserList();
		return new Result(ErrorCodeEnum.E0000.getCode(),ErrorCodeEnum.E0000.getMsg(),userList);
	}

}
