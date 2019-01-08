package com.core.work.entity;


import javax.persistence.*;

/**
 * Company：成都阳帆网络科技有限公司
 * Description:
 *
 * @Author
 * @Date 2018/12/20 0020 14:58
 */
@Entity
@Table(name = "login_info")
public class LoginEntity extends AbstractEntity {

    @Column(name = "phone", length = 40)
    private String phone;
    @Column(name = "passWord", length = 200)
    private String passWord;
    /**
     * 盐 - 后期用于加密密码
     */
    private String salt;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
