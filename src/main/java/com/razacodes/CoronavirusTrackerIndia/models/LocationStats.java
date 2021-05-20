package com.razacodes.CoronavirusTrackerIndia.models;

public class LocationStats {
    private String State;
    private String Confirmed;
    private String Recovered;
    private String Deaths;
    private String Active;
    private String State_code;

    public LocationStats() {
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(String confirmed) {
        Confirmed = confirmed;
    }

    public String getRecovered() {
        return Recovered;
    }

    public void setRecovered(String recovered) {
        Recovered = recovered;
    }

    public String getDeaths() {
        return Deaths;
    }

    public void setDeaths(String deaths) {
        Deaths = deaths;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getState_code() {
        return State_code;
    }

    public void setState_code(String state_code) {
        State_code = state_code;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "State='" + State + '\'' +
                ", Confirmed='" + Confirmed + '\'' +
                ", Recovered='" + Recovered + '\'' +
                ", Deaths='" + Deaths + '\'' +
                ", Active='" + Active + '\'' +
                ", State_code='" + State_code + '\'' +
                '}';
    }
}
