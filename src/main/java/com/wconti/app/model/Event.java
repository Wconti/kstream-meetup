package com.wconti.app.model;

/**
 * Created by ippon on 22/03/17.
 */

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "event_name",
        "event_id",
        "time",
        "event_url"
})
public class Event {

    @JsonProperty("event_name")
    private String eventName;
    @JsonProperty("event_id")
    private String eventId;
    @JsonProperty("time")
    private BigInteger time;
    @JsonProperty("event_url")
    private String eventUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("event_name")
    public String getEventName() {
        return eventName;
    }

    @JsonProperty("event_name")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("event_id")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("time")
    public BigInteger getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(BigInteger time) {
        this.time = time;
    }

    @JsonProperty("event_url")
    public String getEventUrl() {
        return eventUrl;
    }

    @JsonProperty("event_url")
    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}