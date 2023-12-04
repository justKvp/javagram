package io.iqark.restclient.steampojo.getmatchhistory;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Result {
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("num_results")
    private Integer numResults;
    @JsonProperty("total_results")
    private Integer totResults;
    @JsonProperty("results_remaining")
    private Integer resultsRemaining;
    @JsonProperty("matches")
    private List<Match> matches = new ArrayList<>();

    public Integer getStatus() {
        return status;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public Integer getTotResults() {
        return totResults;
    }

    public Integer getResultsRemaining() {
        return resultsRemaining;
    }

    public List<Match> getMatches() {
        return matches;
    }
}
