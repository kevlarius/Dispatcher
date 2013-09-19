package com.kessy;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.kessy.dao.DataProvider;
import com.kessy.entities.TaskLight;

@Path("/")
public class DispatcherServlet {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<TaskLight> getTask(@QueryParam("courier") String operCode) {
		if (operCode == null || operCode.isEmpty()) {
			return DataProvider.getInstance().getAllTaskLight();			
		} else {
			return null;
		}
	}
	
	@GET
	public Response createTask(@QueryParam("courier") String courierId,
			@QueryParam("address") String address, @QueryParam("notes") String notes) {
		DataProvider.getInstance().addTask(courierId, address, notes);
		
		return Response.status(200).entity("Done").build();
	}
}
