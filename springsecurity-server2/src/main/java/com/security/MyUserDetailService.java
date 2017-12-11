package com.security;

/**
 * Created by Lenovo-PC-QR on 2016/11/23.
 */

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        GrantedAuthorityImpl auth2 = new GrantedAuthorityImpl("ROLE_ADMIN");
        if (username.equals("cyu")) {
            auths = new ArrayList<GrantedAuthority>();
            GrantedAuthorityImpl auth1 = new GrantedAuthorityImpl("ROLE_USER");
            auths.add(auth1);
            auths.add(auth2);
        }
// User(String username, String password, boolean enabled, boolea accountNonExpired,boolean credentialsNonExpired, boolean accountNonLocked,Collection<GrantedAuthority> authorities) {
        User user = new User(username, "sap123", true, true, true, true, auths);
        return user;
    }
}

