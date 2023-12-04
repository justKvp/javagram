package io.iqark.restclient;

import io.iqark.restclient.steampojo.JsonResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(baseUri = "http://api.steampowered.com", configKey="steam-api")
public interface SteamAPI {

    @GET
    @Path("/ISteamUser/GetPlayerSummaries/v2/")
    JsonResponse getPlayerSummaries(@QueryParam("steamids") String steamids, @QueryParam("key") String key);
}
