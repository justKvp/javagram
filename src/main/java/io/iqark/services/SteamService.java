package io.iqark.services;

import io.iqark.restclient.SteamAPI;
import io.iqark.util.RUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class SteamService {
    @RestClient
    SteamAPI steamAPI;

    public Response getPlayerData(String steamIds) {
        return RUtil.success(steamAPI.getPlayerSummaries(steamIds, "41818F559459281A03B5D9EEAAA3E8E3"));
    }
}
