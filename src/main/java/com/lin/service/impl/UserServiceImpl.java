package com.lin.service.impl;

import com.lin.domain.User;
import com.lin.service.BaseService;
import com.lin.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService {
}
