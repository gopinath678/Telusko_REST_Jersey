package com.telusko.REST.Telusko_2_REST_CreateResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	
	@GET
    @Produces(MediaType.APPLICATION_XML)
	public Alien getAlien() {
		System.out.println("getAlien called");
		Alien alienobj=new Alien();
		alienobj.setName("prasanna");
		alienobj.setPoints(60);		
		return alienobj;
	}
}
