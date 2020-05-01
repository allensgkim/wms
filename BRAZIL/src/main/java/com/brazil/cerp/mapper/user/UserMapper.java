package com.brazil.cerp.mapper.user;

import com.brazil.cerp.domain.UserVO;

public interface UserMapper {
	UserVO getLoginInfor(String id) throws Exception;
}
