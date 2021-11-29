package br.com.lojalines.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.lojalines.DTO.UserModel;


@Stateless
public class UserLines {
   
    @PersistenceContext
    private EntityManager pers;
    
    public void createUser(UserModel usuario){
        
       pers.persist(usuario);
        
    }

	public List<UserModel> listUser() {
		// TODO Auto-generated method stub
		TypedQuery<UserModel> result = pers.createQuery("select u from UserModel u",UserModel.class);
		return result.getResultList();
	}
}
