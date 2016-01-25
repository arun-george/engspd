package com.spdf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.spdf.domain.Profile;

@Path("/profile")
public class ProfileService {
	
	@GET
	@Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response getMember(@PathParam("param") String id) {

		Profile prof = new Profile();
		prof.setFirst_name("Arthur");
		prof.setLast_name("Doyle");
		Gson gson = new Gson();
		String json = gson.toJson(prof);
		System.out.println(json);
		return Response.status(200).entity(json).build();

	}	

}
