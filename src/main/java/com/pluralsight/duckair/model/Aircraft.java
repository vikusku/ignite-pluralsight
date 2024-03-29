package com.pluralsight.duckair.model;

import java.io.Serializable;

/**
 * Aircraft definition.
 * 
 * This file was generated by Ignite Web Console (03/21/2019, 13:45)
 **/
public class Aircraft implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for aircraftAbbr. */
    private String aircraftAbbr;

    /** Value for aircraftName. */
    private String aircraftName;

    /** Value for landingRollOut. */
    private Integer landingRollOut;

    /** Value for manufacturer. */
    private String manufacturer;

    /** Value for maxCruiseSpeed. */
    private Integer maxCruiseSpeed;

    /** Value for maxRangeSpeed. */
    private Integer maxRangeSpeed;

    /** Value for normCruiseSpeed. */
    private Integer normCruiseSpeed;

    /** Value for aircraftRange. */
    private Integer aircraftRange;

    /** Value for rateOfClimb. */
    private Integer rateOfClimb;

    /** Value for serviceCeiling. */
    private Integer serviceCeiling;

    /** Value for stallSpeed. */
    private Integer stallSpeed;

    /** Value for takeoffRoll. */
    private Integer takeoffRoll;

    /** Empty constructor. **/
    public Aircraft() {
        // No-op.
    }

    /** Full constructor. **/
    public Aircraft(String aircraftAbbr,
        String aircraftName,
        Integer landingRollOut,
        String manufacturer,
        Integer maxCruiseSpeed,
        Integer maxRangeSpeed,
        Integer normCruiseSpeed,
        Integer aircraftRange,
        Integer rateOfClimb,
        Integer serviceCeiling,
        Integer stallSpeed,
        Integer takeoffRoll) {
        this.aircraftAbbr = aircraftAbbr;
        this.aircraftName = aircraftName;
        this.landingRollOut = landingRollOut;
        this.manufacturer = manufacturer;
        this.maxCruiseSpeed = maxCruiseSpeed;
        this.maxRangeSpeed = maxRangeSpeed;
        this.normCruiseSpeed = normCruiseSpeed;
        this.aircraftRange = aircraftRange;
        this.rateOfClimb = rateOfClimb;
        this.serviceCeiling = serviceCeiling;
        this.stallSpeed = stallSpeed;
        this.takeoffRoll = takeoffRoll;
    }

    /**
     * Gets aircraftAbbr
     * 
     * @return Value for aircraftAbbr.
     **/
    public String getAircraftAbbr() {
        return aircraftAbbr;
    }

    /**
     * Sets aircraftAbbr
     * 
     * @param aircraftAbbr New value for aircraftAbbr.
     **/
    public void setAircraftAbbr(String aircraftAbbr) {
        this.aircraftAbbr = aircraftAbbr;
    }

    /**
     * Gets aircraftName
     * 
     * @return Value for aircraftName.
     **/
    public String getAircraftName() {
        return aircraftName;
    }

    /**
     * Sets aircraftName
     * 
     * @param aircraftName New value for aircraftName.
     **/
    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    /**
     * Gets landingRollOut
     * 
     * @return Value for landingRollOut.
     **/
    public Integer getLandingRollOut() {
        return landingRollOut;
    }

    /**
     * Sets landingRollOut
     * 
     * @param landingRollOut New value for landingRollOut.
     **/
    public void setLandingRollOut(Integer landingRollOut) {
        this.landingRollOut = landingRollOut;
    }

    /**
     * Gets manufacturer
     * 
     * @return Value for manufacturer.
     **/
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets manufacturer
     * 
     * @param manufacturer New value for manufacturer.
     **/
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets maxCruiseSpeed
     * 
     * @return Value for maxCruiseSpeed.
     **/
    public Integer getMaxCruiseSpeed() {
        return maxCruiseSpeed;
    }

    /**
     * Sets maxCruiseSpeed
     * 
     * @param maxCruiseSpeed New value for maxCruiseSpeed.
     **/
    public void setMaxCruiseSpeed(Integer maxCruiseSpeed) {
        this.maxCruiseSpeed = maxCruiseSpeed;
    }

    /**
     * Gets maxRangeSpeed
     * 
     * @return Value for maxRangeSpeed.
     **/
    public Integer getMaxRangeSpeed() {
        return maxRangeSpeed;
    }

    /**
     * Sets maxRangeSpeed
     * 
     * @param maxRangeSpeed New value for maxRangeSpeed.
     **/
    public void setMaxRangeSpeed(Integer maxRangeSpeed) {
        this.maxRangeSpeed = maxRangeSpeed;
    }

    /**
     * Gets normCruiseSpeed
     * 
     * @return Value for normCruiseSpeed.
     **/
    public Integer getNormCruiseSpeed() {
        return normCruiseSpeed;
    }

    /**
     * Sets normCruiseSpeed
     * 
     * @param normCruiseSpeed New value for normCruiseSpeed.
     **/
    public void setNormCruiseSpeed(Integer normCruiseSpeed) {
        this.normCruiseSpeed = normCruiseSpeed;
    }

    /**
     * Gets aircraftRange
     * 
     * @return Value for aircraftRange.
     **/
    public Integer getAircraftRange() {
        return aircraftRange;
    }

    /**
     * Sets aircraftRange
     * 
     * @param aircraftRange New value for aircraftRange.
     **/
    public void setAircraftRange(Integer aircraftRange) {
        this.aircraftRange = aircraftRange;
    }

    /**
     * Gets rateOfClimb
     * 
     * @return Value for rateOfClimb.
     **/
    public Integer getRateOfClimb() {
        return rateOfClimb;
    }

    /**
     * Sets rateOfClimb
     * 
     * @param rateOfClimb New value for rateOfClimb.
     **/
    public void setRateOfClimb(Integer rateOfClimb) {
        this.rateOfClimb = rateOfClimb;
    }

    /**
     * Gets serviceCeiling
     * 
     * @return Value for serviceCeiling.
     **/
    public Integer getServiceCeiling() {
        return serviceCeiling;
    }

    /**
     * Sets serviceCeiling
     * 
     * @param serviceCeiling New value for serviceCeiling.
     **/
    public void setServiceCeiling(Integer serviceCeiling) {
        this.serviceCeiling = serviceCeiling;
    }

    /**
     * Gets stallSpeed
     * 
     * @return Value for stallSpeed.
     **/
    public Integer getStallSpeed() {
        return stallSpeed;
    }

    /**
     * Sets stallSpeed
     * 
     * @param stallSpeed New value for stallSpeed.
     **/
    public void setStallSpeed(Integer stallSpeed) {
        this.stallSpeed = stallSpeed;
    }

    /**
     * Gets takeoffRoll
     * 
     * @return Value for takeoffRoll.
     **/
    public Integer getTakeoffRoll() {
        return takeoffRoll;
    }

    /**
     * Sets takeoffRoll
     * 
     * @param takeoffRoll New value for takeoffRoll.
     **/
    public void setTakeoffRoll(Integer takeoffRoll) {
        this.takeoffRoll = takeoffRoll;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof Aircraft))
            return false;
        
        Aircraft that = (Aircraft)o;

        if (aircraftAbbr != null ? !aircraftAbbr.equals(that.aircraftAbbr) : that.aircraftAbbr != null)
            return false;
        

        if (aircraftName != null ? !aircraftName.equals(that.aircraftName) : that.aircraftName != null)
            return false;
        

        if (landingRollOut != null ? !landingRollOut.equals(that.landingRollOut) : that.landingRollOut != null)
            return false;
        

        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null)
            return false;
        

        if (maxCruiseSpeed != null ? !maxCruiseSpeed.equals(that.maxCruiseSpeed) : that.maxCruiseSpeed != null)
            return false;
        

        if (maxRangeSpeed != null ? !maxRangeSpeed.equals(that.maxRangeSpeed) : that.maxRangeSpeed != null)
            return false;
        

        if (normCruiseSpeed != null ? !normCruiseSpeed.equals(that.normCruiseSpeed) : that.normCruiseSpeed != null)
            return false;
        

        if (aircraftRange != null ? !aircraftRange.equals(that.aircraftRange) : that.aircraftRange != null)
            return false;
        

        if (rateOfClimb != null ? !rateOfClimb.equals(that.rateOfClimb) : that.rateOfClimb != null)
            return false;
        

        if (serviceCeiling != null ? !serviceCeiling.equals(that.serviceCeiling) : that.serviceCeiling != null)
            return false;
        

        if (stallSpeed != null ? !stallSpeed.equals(that.stallSpeed) : that.stallSpeed != null)
            return false;
        

        if (takeoffRoll != null ? !takeoffRoll.equals(that.takeoffRoll) : that.takeoffRoll != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = aircraftAbbr != null ? aircraftAbbr.hashCode() : 0;

        res = 31 * res + (aircraftName != null ? aircraftName.hashCode() : 0);

        res = 31 * res + (landingRollOut != null ? landingRollOut.hashCode() : 0);

        res = 31 * res + (manufacturer != null ? manufacturer.hashCode() : 0);

        res = 31 * res + (maxCruiseSpeed != null ? maxCruiseSpeed.hashCode() : 0);

        res = 31 * res + (maxRangeSpeed != null ? maxRangeSpeed.hashCode() : 0);

        res = 31 * res + (normCruiseSpeed != null ? normCruiseSpeed.hashCode() : 0);

        res = 31 * res + (aircraftRange != null ? aircraftRange.hashCode() : 0);

        res = 31 * res + (rateOfClimb != null ? rateOfClimb.hashCode() : 0);

        res = 31 * res + (serviceCeiling != null ? serviceCeiling.hashCode() : 0);

        res = 31 * res + (stallSpeed != null ? stallSpeed.hashCode() : 0);

        res = 31 * res + (takeoffRoll != null ? takeoffRoll.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "Aircraft [" + 
            "aircraftAbbr=" + aircraftAbbr + ", " + 
            "aircraftName=" + aircraftName + ", " + 
            "landingRollOut=" + landingRollOut + ", " + 
            "manufacturer=" + manufacturer + ", " + 
            "maxCruiseSpeed=" + maxCruiseSpeed + ", " + 
            "maxRangeSpeed=" + maxRangeSpeed + ", " + 
            "normCruiseSpeed=" + normCruiseSpeed + ", " + 
            "aircraftRange=" + aircraftRange + ", " + 
            "rateOfClimb=" + rateOfClimb + ", " + 
            "serviceCeiling=" + serviceCeiling + ", " + 
            "stallSpeed=" + stallSpeed + ", " + 
            "takeoffRoll=" + takeoffRoll +
        "]";
    }
}