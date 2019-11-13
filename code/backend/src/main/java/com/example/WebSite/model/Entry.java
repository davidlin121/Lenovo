package com.example.WebSite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
    private final String Dock_PN;
    private final String Compatibility_PN;
    private  String Description;
    private  String Description2;
    private Integer Footnoot_ID;
    public Entry(@JsonProperty("DP") String Dock_PN,
                 @JsonProperty("CP") String Compatibility_PN){
        this.Dock_PN = Dock_PN;
        this.Compatibility_PN = Compatibility_PN;
    }

    public String getDock_PN() {
        return Dock_PN;
    }

    public String getCompatibility_PN() {
        return Compatibility_PN;
    }

    public String getDescription() {
        return Description;
    }

    public String getDescription2() {
        return Description2;
    }

    public Integer getFootnoot_ID() {
        return Footnoot_ID;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDescription2(String description2) {
        Description2 = description2;
    }

    public void setFootnoot_ID(Integer footnoot_ID) {
        Footnoot_ID = footnoot_ID;
    }
}

