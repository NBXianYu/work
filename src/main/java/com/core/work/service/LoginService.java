package com.core.work.service;

import com.core.work.entity.LoginEntity;

import java.util.List;

/**
 * Company：成都阳帆网络科技有限公司
 * Description:
 *
 * @Author
 * @Date 2018/12/20 0020 18:23
 */
public interface LoginService {

    public List<LoginEntity> findAllLoginInfo();
}
