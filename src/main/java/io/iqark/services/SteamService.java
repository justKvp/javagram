package io.iqark.services;

import io.iqark.restclient.SteamAPI;
import io.iqark.util.RUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import static io.iqark.constant.Constant.STEAM_KEY;

@ApplicationScoped
public class SteamService {
    @RestClient
    SteamAPI steamAPI;

    public Response getPlayerData(String steamIds) {
        return RUtil.success(steamAPI.getPlayerSummaries(steamIds, STEAM_KEY));
    }

    public Response getMatchHistory(String accId, Integer matchesCount) {
        return RUtil.success(steamAPI.getMatchHistory(accId, matchesCount, STEAM_KEY));
    }
}
