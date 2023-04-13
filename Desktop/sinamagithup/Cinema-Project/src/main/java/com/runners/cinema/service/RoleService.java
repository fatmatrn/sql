package com.runners.cinema.service;

import com.runners.cinema.exception.ErrorMessage;
import com.runners.cinema.exception.ResourceNotFoundException;
import com.runners.cinema.model.Role;
import com.runners.cinema.model.enums.RoleType;
import com.runners.cinema.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private  final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByType(RoleType roleType) {
       Role role =  roleRepository.findByType(roleType).orElseThrow(()->
               new ResourceNotFoundException(String.format(ErrorMessage.ROLE_NOT_FOUND,roleType.getName())));//????????????getname mi name mi
       return  role;

    }
}
