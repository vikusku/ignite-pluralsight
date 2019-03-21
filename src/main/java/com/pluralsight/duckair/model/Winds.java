package com.pluralsight.duckair.model;

import java.io.Serializable;

/**
 * Winds definition.
 * 
 * This file was generated by Ignite Web Console (03/21/2019, 13:45)
 **/
public class Winds implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for station. */
    private String station;

    /** Value for altitude. */
    private Integer altitude;

    /** Value for direction. */
    private Integer direction;

    /** Value for speed. */
    private Integer speed;

    /** Value for tempurature. */
    private Integer tempurature;

    /** Empty constructor. **/
    public Winds() {
        // No-op.
    }

    /** Full constructor. **/
    public Winds(String station,
        Integer altitude,
        Integer direction,
        Integer speed,
        Integer tempurature) {
        this.station = station;
        this.altitude = altitude;
        this.direction = direction;
        this.speed = speed;
        this.tempurature = tempurature;
    }

    /**
     * Gets station
     * 
     * @return Value for station.
     **/
    public String getStation() {
        return station;
    }

    /**
     * Sets station
     * 
     * @param station New value for station.
     **/
    public void setStation(String station) {
        this.station = station;
    }

    /**
     * Gets altitude
     * 
     * @return Value for altitude.
     **/
    public Integer getAltitude() {
        return altitude;
    }

    /**
     * Sets altitude
     * 
     * @param altitude New value for altitude.
     **/
    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    /**
     * Gets direction
     * 
     * @return Value for direction.
     **/
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets direction
     * 
     * @param direction New value for direction.
     **/
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    /**
     * Gets speed
     * 
     * @return Value for speed.
     **/
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Sets speed
     * 
     * @param speed New value for speed.
     **/
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * Gets tempurature
     * 
     * @return Value for tempurature.
     **/
    public Integer getTempurature() {
        return tempurature;
    }

    /**
     * Sets tempurature
     * 
     * @param tempurature New value for tempurature.
     **/
    public void setTempurature(Integer tempurature) {
        this.tempurature = tempurature;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof Winds))
            return false;
        
        Winds that = (Winds)o;

        if (station != null ? !station.equals(that.station) : that.station != null)
            return false;
        

        if (altitude != null ? !altitude.equals(that.altitude) : that.altitude != null)
            return false;
        

        if (direction != null ? !direction.equals(that.direction) : that.direction != null)
            return false;
        

        if (speed != null ? !speed.equals(that.speed) : that.speed != null)
            return false;
        

        if (tempurature != null ? !tempurature.equals(that.tempurature) : that.tempurature != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = station != null ? station.hashCode() : 0;

        res = 31 * res + (altitude != null ? altitude.hashCode() : 0);

        res = 31 * res + (direction != null ? direction.hashCode() : 0);

        res = 31 * res + (speed != null ? speed.hashCode() : 0);

        res = 31 * res + (tempurature != null ? tempurature.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "Winds [" + 
            "station=" + station + ", " + 
            "altitude=" + altitude + ", " + 
            "direction=" + direction + ", " + 
            "speed=" + speed + ", " + 
            "tempurature=" + tempurature +
        "]";
    }
}