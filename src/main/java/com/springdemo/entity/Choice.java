package com.springdemo.entity;

public class Choice {

    private int id;
    private int distance;
    private String season;
    private String relief;

    public Choice(int id, int distance, String season, String relief) {
        this.id = id;
        this.distance = distance;
        this.season = season;
        this.relief = relief;
    }

    public Choice(int distance, String season, String relief) {
        this.distance = distance;
        this.season = season;
        this.relief = relief;
    }

    public Choice(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRelief() {
        return relief;
    }

    public void setRelief(String relief) {
        this.relief = relief;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "id=" + id +
                ", distance=" + distance +
                ", season='" + season + '\'' +
                ", relief='" + relief + '\'' +
                '}';
    }
}
