package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coord {
    public Double getLon() {
        return lon;
    }

    public Double getLat() {
        return lat;
    }

    @JsonProperty("lon")
    public Double lon;
    @JsonProperty("lat")
    public Double lat;
}

