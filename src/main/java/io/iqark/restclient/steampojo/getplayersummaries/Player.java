package io.iqark.restclient.steampojo.getplayersummaries;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.time.Instant;

public class Player {
    @JsonProperty("steamid")
    private String steamid;
    @JsonProperty("communityvisibilitystate")
    private Integer communityvisibilitystate;
    @JsonProperty("profilestate")
    private Integer profilestate;
    @JsonProperty("personaname")
    private String personaname;
    @JsonProperty("profileurl")
    private String profileurl;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("avatarmedium")
    private String avatarmedium;
    @JsonProperty("avatarfull")
    private String avatarfull;
    @JsonProperty("avatarhash")
    private String avatarhash;
    @JsonProperty("lastlogoff")
    private Instant lastlogoff;
    @JsonProperty("personastate")
    private Integer personastate;
    @JsonProperty("primaryclanid")
    private String primaryclanid;
    @JsonProperty("timecreated")
    private Instant timecreated;
    @JsonProperty("personastateflags")
    private Integer personastateflags;

    public String getSteamid() {
        return steamid;
    }

    public Integer getCommunityvisibilitystate() {
        return communityvisibilitystate;
    }

    public Integer getProfilestate() {
        return profilestate;
    }

    public String getPersonaname() {
        return personaname;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarmedium() {
        return avatarmedium;
    }

    public String getAvatarfull() {
        return avatarfull;
    }

    public String getAvatarhash() {
        return avatarhash;
    }

    public Instant getLastlogoff() {
        return lastlogoff;
    }

    public Integer getPersonastate() {
        return personastate;
    }

    public String getPrimaryclanid() {
        return primaryclanid;
    }

    public Instant getTimecreated() {
        return timecreated;
    }

    public Integer getPersonastateflags() {
        return personastateflags;
    }
}
