package io.iqark.restclient.steampojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Response {
    @JsonProperty("players")
    private List<Player> players = new ArrayList<>();
}
