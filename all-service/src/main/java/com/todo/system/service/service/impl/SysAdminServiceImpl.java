package com.todo.system.service.service.impl;


import com.todo.system.entity.po.SysAdmin;
import com.todo.system.orm.mapper.SysAdminMapper;
import com.todo.system.service.service.SysAdminService;
import com.todo.system.util.exception.ParamNullException;
import com.todo.system.util.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAdminServiceImpl implements SysAdminService {

    @Autowired
    SysAdminMapper sysAdminMapper;

    @Override
    public SysAdmin getSingleAdmin(String userName, String password) throws ParamNullException {
        if (StringUtil.isEmpty(userName) || StringUtil.isEmpty(password))
            throw new ParamNullException("roleId 参数为空");

        return sysAdminMapper.selectSingleByNameAndPwd(userName, password);
    }
}