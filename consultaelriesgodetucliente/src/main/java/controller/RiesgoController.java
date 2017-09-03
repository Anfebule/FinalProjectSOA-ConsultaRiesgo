package controller;

import java.util.HashMap;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class RiesgoController {
	
	@Path("/creditProfile")
	@POST
	@Produces("application/json")
	public String consultarRiesgo(HashMap<String, String> recievedData){
		return recievedData.toString();
	}
}
