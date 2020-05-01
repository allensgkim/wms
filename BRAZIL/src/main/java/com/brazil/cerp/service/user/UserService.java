package com.brazil.cerp.service.user;

import com.brazil.cerp.domain.UserVO;
import com.brazil.cerp.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserVO getLoginInfor(String id) throws Exception {
        return userMapper.getLoginInfor(id);
    }
}
