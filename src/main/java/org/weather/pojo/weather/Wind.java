package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {
    public Float getSpeed() {
        return speed;
    }

    public Float getDeg() {
        return deg;
    }

    public Float getGust() {
        return gust;
    }

    @JsonProperty("speed")
    public Float speed;
    @JsonProperty("deg")
    public Float deg;
    @JsonProperty("gust")
    public Float gust;
}
