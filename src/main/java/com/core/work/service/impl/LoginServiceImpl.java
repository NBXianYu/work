package com.core.work.service.impl;

import com.core.work.entity.LoginEntity;
import com.core.work.repository.LoginRepository;
import com.core.work.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Company：成都阳帆网络科技有限公司
 * Description:
 *
 * @Author
 * @Date 2018/12/20 0020 18:25
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<LoginEntity> findAllLoginInfo() {

        return loginRepository.findAll();
    }
}
