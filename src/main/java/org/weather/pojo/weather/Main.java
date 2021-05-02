package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    public Float getTemp() {
        return temp;
    }

    public Float getFeels_like() {
        return feels_like;
    }

    public Float getTemp_min() {
        return temp_min;
    }

    public Float getTemp_max() {
        return temp_max;
    }

    public Float getPressure() {
        return pressure;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getSea_level() {
        return sea_level;
    }

    public Float getGrnd_level() {
        return grnd_level;
    }

    @JsonProperty("temp")
    public Float temp;
    @JsonProperty("feels_like")
    public Float feels_like;
    @JsonProperty("temp_min")
    public Float temp_min;
    @JsonProperty("temp_max")
    public Float temp_max;
    @JsonProperty("pressure")
    public Float pressure;
    @JsonProperty("humidity")
    public Float humidity;
    @JsonProperty("sea_level")
    public Float sea_level;
    @JsonProperty("grnd_level")
    public Float grnd_level;
}