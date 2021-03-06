package com.wconti.app.model;

/**
 * Created by ippon on 22/03/17.
 */

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "group_topics",
        "group_city",
        "group_country",
        "group_id",
        "group_name",
        "group_lon",
        "group_urlname",
        "group_lat"
})
public class Group {

    @JsonProperty("group_topics")
    private List<GroupTopic> groupTopics = null;
    @JsonProperty("group_city")
    private String groupCity;
    @JsonProperty("group_country")
    private String groupCountry;
    @JsonProperty("group_id")
    private BigInteger groupId;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("group_lon")
    private Double groupLon;
    @JsonProperty("group_urlname")
    private String groupUrlname;
    @JsonProperty("group_lat")
    private Double groupLat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("group_topics")
    public List<GroupTopic> getGroupTopics() {
        return groupTopics;
    }

    @JsonProperty("group_topics")
    public void setGroupTopics(List<GroupTopic> groupTopics) {
        this.groupTopics = groupTopics;
    }

    @JsonProperty("group_city")
    public String getGroupCity() {
        return groupCity;
    }

    @JsonProperty("group_city")
    public void setGroupCity(String groupCity) {
        this.groupCity = groupCity;
    }

    @JsonProperty("group_country")
    public String getGroupCountry() {
        return groupCountry;
    }

    @JsonProperty("group_country")
    public void setGroupCountry(String groupCountry) {
        this.groupCountry = groupCountry;
    }

    @JsonProperty("group_id")
    public BigInteger getGroupId() {
        return groupId;
    }

    @JsonProperty("group_id")
    public void setGroupId(BigInteger groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("group_lon")
    public Double getGroupLon() {
        return groupLon;
    }

    @JsonProperty("group_lon")
    public void setGroupLon(Double groupLon) {
        this.groupLon = groupLon;
    }

    @JsonProperty("group_urlname")
    public String getGroupUrlname() {
        return groupUrlname;
    }

    @JsonProperty("group_urlname")
    public void setGroupUrlname(String groupUrlname) {
        this.groupUrlname = groupUrlname;
    }

    @JsonProperty("group_lat")
    public Double getGroupLat() {
        return groupLat;
    }

    @JsonProperty("group_lat")
    public void setGroupLat(Double groupLat) {
        this.groupLat = groupLat;
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
