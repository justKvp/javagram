package io.iqark.resources;

import io.iqark.services.HeroService;
import io.iqark.services.SteamService;
import io.iqark.util.RUtil;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class GreetingResource {
    @Inject
    SteamService steamService;
    @Inject
    HeroService heroService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/getHero/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHero(@PathParam("name") String name) {
        return RUtil.success(heroService.getHero(name));
    }

    @GET
    @Path("/getHeroId/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHeroId(@PathParam("id") Integer id) {
        return RUtil.success(heroService.getHeroById(id));
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
