package com.ws.dl.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dl.www.service.GetUserService;
import com.ws.dl.www.sql.condition.LoginCondition;
import com.ws.dl.www.sql.entity.LoginEntity;
import com.ws.dl.www.sql.mapper.LoginMapper;

@Service
public class GetUserServiceImpl implements GetUserService {

	@Autowired
	private LoginMapper mapper;

	public String getUser(String id) {
		LoginCondition condition = new LoginCondition();
		condition.setId(id);
		LoginEntity entity = mapper.getUser(condition);

		if (entity == null) {
			return "";
		}
		return entity.getName();
	}

	public int updateUser(String id) {
		LoginCondition condition = new LoginCondition();
		condition.setId(id);
		condition.setName("更新名称１");

		int cnt = mapper.updateUser(condition);

		return cnt;
	}
}
