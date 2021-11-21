package org.example.service.model;

public class UrinationMessage {

    private String timestamp;
    private Double volume_ml;

    public UrinationMessage() {
    }

    public UrinationMessage(String timestamp, Double volume_ml) {
        this.timestamp = timestamp;
        this.volume_ml = volume_ml;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getVolume_ml() {
        return volume_ml;
    }

    public void setVolume_ml(Double volume_ml) {
        this.volume_ml = volume_ml;
    }
}
