package io.iqark.restclient.steampojo.getmatchhistory;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Match {
    @JsonProperty("match_id")
    private Long matchId;
    @JsonProperty("match_seq_num")
    private Long matchSeq;
    @JsonProperty("start_time")
    private Instant startTime;
    @JsonProperty("lobby_type")
    private Integer lobbyType;
    @JsonProperty("radiant_team_id")
    private Integer radiantTeamId;
    @JsonProperty("dire_team_id")
    private Integer direTeamId;
    @JsonProperty("players")
    private List<MatchPlayer> matches = new ArrayList<>();

    public Long getMatchId() {
        return matchId;
    }

    public Long getMatchSeq() {
        return matchSeq;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Integer getRadiantTeamId() {
        return radiantTeamId;
    }

    public Integer getDireTeamId() {
        return direTeamId;
    }

    public List<MatchPlayer> getMatches() {
        return matches;
    }
}
