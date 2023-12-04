package io.iqark.restclient.steampojo.getmatchhistory;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchPlayer {
    @JsonProperty("account_id")
    private Long accId;
    @JsonProperty("player_slot")
    private Integer playerSlot;
    @JsonProperty("team_number")
    private Integer teamNumber;
    @JsonProperty("team_slot")
    private Integer teamSlot;
    @JsonProperty("hero_id")
    private Integer heroId;

    public Long getAccId() {
        return accId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public Integer getTeamNumber() {
        return teamNumber;
    }

    public Integer getTeamSlot() {
        return teamSlot;
    }

    public Integer getHeroId() {
        return heroId;
    }
}
