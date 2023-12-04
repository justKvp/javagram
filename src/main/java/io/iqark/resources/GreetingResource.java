package io.iqark.resources;

import io.iqark.services.OConstantHolder;
import io.iqark.services.SteamService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.json.JSONObject;

@Path("/")
public class GreetingResource {
    @Inject
    SteamService steamService;
    @Inject
    OConstantHolder oConstantHolder;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/hello2")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello2() {
        return oConstantHolder.heroes.toString();
    }

    @GET
    @Path("/getPlayerData")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPlayerData() {
        return steamService.getPlayerData("76561199435378592");
    }

    @GET
    @Path("/getMatchHistory")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMatchHistory() {
        return steamService.getMatchHistory("76561198018736829", 1);
    }
}
