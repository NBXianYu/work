package com.core.work.controller;

import com.core.work.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company：成都阳帆网络科技有限公司
 * Description:
 *
 * @Author
 * @Date 2018/12/20 0020 18:20
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;


    @GetMapping("/findAll")
    public String addLogin() {

        return loginService.findAllLoginInfo().toString();
    }

}
