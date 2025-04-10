package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> trainSeat;
    private Map<String, String> stationTime;
    private List<String> station;


    public Train(){}

    public Train(String trainId, String trainNo, List<List<Integer>> trainSeat, Map<String, String> stationTime, List<String> station){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.trainSeat = trainSeat;
        this.stationTime = stationTime;
        this.station = station;
    }

    public List<String> getStations(){
        return station;
    }

    public List<List<Integer>> getSeats() {
        return trainSeat;
    }

    public void setSeats(List<List<Integer>> seats){
        this.trainSeat = seats;
    }

    public String getTrainId(){
        return trainId;
    }

    public Map<String, String> getStationTimes(){
        return stationTime;
    }

    public String getTrainNo(){
        return trainNo;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setStationTimes(Map<String, String> stationTimes){
        this.stationTime = stationTimes;
    }

    public void setStations(List<String> stations){
        this.station = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }

}
