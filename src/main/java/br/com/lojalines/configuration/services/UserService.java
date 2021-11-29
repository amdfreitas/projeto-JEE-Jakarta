package br.com.lojalines.configuration.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.lojalines.DTO.UserModel;
import br.com.lojalines.controller.UserController;

@Path("usuarios")
public class UserService {

	@Inject
	private UserController usercont;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(UserModel usuario) {
		usercont.createUser(usuario);
		return Response.ok().build();
	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.TEXT_HTML })
	public Response listaUser() {
		return Response.ok(usercont.listUser()).build();
	}

}
