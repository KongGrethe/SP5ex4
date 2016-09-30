/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.google.gson.Gson;
import entities.dataGenerator;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 */
@Path("/addresses")
public class GenericResource {
    private Gson gson = new Gson();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }
    
    @GET
    @Path("/{maxindex}/{filter}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsers(@PathParam("maxindex") int maxindex, @PathParam("filter") String filter) {
        //return "Hello " + maxindex + " and " + filter;
        
        dataGenerator dg = new dataGenerator();
        dg.generateData();
        
        String tmp = dg.getData(maxindex, filter);
        
        return tmp;
    }
}
