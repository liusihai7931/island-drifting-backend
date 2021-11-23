package com.verygood.island.security.shiro.token;

import com.verygood.island.entity.User;
import lombok.Data;
import org.apache.shiro.authc.UsernamePasswordToken;

import java.io.Serializable;

@Data
public class WechatToken extends UsernamePasswordToken implements Serializable {

    private static final long serialVersionUID = 4812793519945855483L;
    private User user;
    private String code;

    public WechatToken(String code) {
        this.code = code;
    }

    @Override
    public Object getPrincipal() {
        return getUser();
    }

    @Override
    public Object getCredentials() {
        return "ok";
    }

}