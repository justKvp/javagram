package io.iqark.restclient;

import io.iqark.restclient.steampojo.getmatchhistory.JsonGetMatchHistory;
import io.iqark.restclient.steampojo.getplayersummaries.JsonGetPlayerSummaries;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(baseUri = "http://api.steampowered.com", configKey="steam-api")
public interface SteamAPI {

    @GET
    @Path("/ISteamUser/GetPlayerSummaries/v2/")
    JsonGetPlayerSummaries getPlayerSummaries(@QueryParam("steamids") String steamids, @QueryParam("key") String key);

    @GET
    @Path("/IDOTA2Match_570/GetMatchHistory/v1")
    JsonGetMatchHistory getMatchHistory(@QueryParam("account_id") String steamid,
                                        @QueryParam("matches_requested") Integer matchesCount,
                                        @QueryParam("key") String key);
}
