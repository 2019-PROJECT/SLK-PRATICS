package com.rc.org.ServiceController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/service")
public class ServiceController {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getServiceInfo(@QueryParam("id") String id) {
	
		
		System.out.println("controller called by jaxrs api");
		
		return "rc3212";
		
	}

}
