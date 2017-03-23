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
        "venue",
        "visibility",
        "response",
        "guests",
        "member",
        "rsvp_id",
        "mtime",
        "event",
        "group"
})
public class Meetup {

    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("response")
    private String response;
    @JsonProperty("guests")
    private BigInteger guests;
    @JsonProperty("member")
    private Member member;
    @JsonProperty("rsvp_id")
    private BigInteger rsvpId;
    @JsonProperty("mtime")
    private BigInteger mtime;
    @JsonProperty("event")
    private Event event;
    @JsonProperty("group")
    private Group group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("response")
    public String getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(String response) {
        this.response = response;
    }

    @JsonProperty("guests")
    public BigInteger getGuests() {
        return guests;
    }

    @JsonProperty("guests")
    public void setGuests(BigInteger guests) {
        this.guests = guests;
    }

    @JsonProperty("member")
    public Member getMember() {
        return member;
    }

    @JsonProperty("member")
    public void setMember(Member member) {
        this.member = member;
    }

    @JsonProperty("rsvp_id")
    public BigInteger getRsvpId() {
        return rsvpId;
    }

    @JsonProperty("rsvp_id")
    public void setRsvpId(BigInteger rsvpId) {
        this.rsvpId = rsvpId;
    }

    @JsonProperty("mtime")
    public BigInteger getMtime() {
        return mtime;
    }

    @JsonProperty("mtime")
    public void setMtime(BigInteger mtime) {
        this.mtime = mtime;
    }

    @JsonProperty("event")
    public Event getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(Event event) {
        this.event = event;
    }

    @JsonProperty("group")
    public Group getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(Group group) {
        this.group = group;
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