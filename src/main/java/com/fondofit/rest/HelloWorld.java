package com.fondofit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/hello")
public class HelloWorld {
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessage(@PathParam("param") String msg){
		String output = "Hello World : "+msg;
		return Response.status(Status.OK).entity(output).build();
	}
}
