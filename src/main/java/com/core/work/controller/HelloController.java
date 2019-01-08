package com.core.work.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company：成都阳帆网络科技有限公司
 * Description:
 *
 * @Author
 * @Date 2018/12/20 0020 14:23
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String helloBoot(){
        return "Hello Boot-JPA";
    }

}
