package com.lin.service.impl;

import com.lin.domain.Role;
import com.lin.service.BaseService;
import com.lin.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl extends BaseService<Role> implements RoleService {
}
