package io.iqark.resources;

import io.iqark.services.SteamService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class GreetingResource {
    @Inject
    SteamService steamService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/getPlayerData")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello2() {
        return steamService.getPlayerData("76561199435378592");
    }

    @GET
    @Path("/getMatchHistory")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello3() {
        return steamService.getMatchHistory("76561198018736829", 1);
    }
}
