package com.telusko.REST.Telusko_3_REST_ReturnList;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	
	@GET
    @Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		System.out.println("getAlien called");
		List<Alien> alienlist=new ArrayList<Alien>();
		
		
		Alien alienobj1=new Alien();
		alienobj1.setName("prasanna");
		alienobj1.setPoints(60);		
		
		Alien alienobj2=new Alien();
		alienobj2.setName("pooja");
		alienobj2.setPoints(80);		
		
		alienlist.add(alienobj1);
		alienlist.add(alienobj2);
		
		return alienlist;
	}
}
