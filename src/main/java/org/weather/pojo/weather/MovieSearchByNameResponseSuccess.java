package org.weather.pojo.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class MovieSearchByNameResponseSuccess{

    @JsonProperty("coord")
    public Coord coord;

    @JsonProperty("weather")
    public List<Weather> weather;

    @JsonProperty("base")
    public String base;

    @JsonProperty("main")
    public Main main;

    @JsonProperty("visibility")
    public BigDecimal visibility;

    @JsonProperty("wind")
    public Wind wind;

    @JsonIgnoreProperties
    @JsonProperty("rain")
    public Rain rain;

    @JsonProperty("clouds")
    public Clouds clouds;

    @JsonProperty("dt")
    public BigDecimal dt;

    @JsonProperty("sys")
    public Sys sys;

    @JsonProperty("timezone")
    public Integer timezone;

    @JsonProperty("id")
    public BigDecimal id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("cod")
    public Integer cod;



}

