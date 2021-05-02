package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    public Float getA() {
        return h;
    }

    @JsonProperty("1h")
    public Float h;
}
