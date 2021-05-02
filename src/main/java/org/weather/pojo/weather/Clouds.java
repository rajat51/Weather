package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds {
    public Float getAll() {
        return all;
    }

    @JsonProperty("all")
    public Float all;
}
