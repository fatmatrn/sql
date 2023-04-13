package com.runners.cinema.security.service;

import com.runners.cinema.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetailsIImpl implements UserDetails {

    private  String email;

    private  String password;

    private Collection<? extends GrantedAuthority>  authorities;

public static UserDetailsIImpl build(User user){
    List<SimpleGrantedAuthority> authorityList = user.getRole()
            .stream().map(role -> new SimpleGrantedAuthority(role.getType().name())).collect(Collectors.toList());

    return new UserDetailsIImpl(user.getEmail(),user.getPassword(),authorityList);
}


    public UserDetailsIImpl(String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

//getter-setter

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
