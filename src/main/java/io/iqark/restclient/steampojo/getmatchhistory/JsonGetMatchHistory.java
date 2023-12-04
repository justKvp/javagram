package io.iqark.restclient.steampojo.getmatchhistory;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonGetMatchHistory {
    @JsonProperty("result")
    private Result result;

    public Result getResult() {
        return result;
    }
}
