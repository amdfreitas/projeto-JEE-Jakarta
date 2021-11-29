package br.com.lojalines.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.lojalines.DAO.UserLines;
import br.com.lojalines.DTO.UserModel;

@Stateless
public class UserController {

    @Inject
    private UserLines  usuarDto;

    public void  createUser(UserModel usuario){
        usuarDto.createUser(usuario);
    }
    
    public List<UserModel> listUser(){
    	return usuarDto.listUser();
    }
    
}
