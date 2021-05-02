package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Sys {
    public String getCountry() {
        return country;
    }

    public BigDecimal getSunrise() {
        return sunrise;
    }

    public BigDecimal getSunset() {
        return sunset;
    }

    @JsonProperty("country")
    public String country;
    @JsonProperty("sunrise")
    public BigDecimal sunrise;
    @JsonProperty("sunset")
    public BigDecimal sunset;
}