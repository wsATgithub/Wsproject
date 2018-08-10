package com.ws.dl.www.sql.mapper;

import com.ws.dl.www.sql.condition.LoginCondition;
import com.ws.dl.www.sql.entity.LoginEntity;

public interface LoginMapper {

	LoginEntity getUser(LoginCondition condition);
}
