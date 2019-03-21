package com.pluralsight.duckair.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * RouteSegments definition.
 * 
 * This file was generated by Ignite Web Console (03/21/2019, 13:45)
 **/
public class RouteSegments implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for routeId. */
    private String routeId;

    /** Value for sequence. */
    private int sequence;

    /** Value for waypointKind. */
    private String waypointKind;

    /** Value for waypointIdent. */
    private String waypointIdent;

    /** Value for waypointName. */
    private String waypointName;

    /** Value for latitude. */
    private BigDecimal latitude;

    /** Value for longitude. */
    private BigDecimal longitude;

    /** Value for viaAirway. */
    private String viaAirway;

    /** Value for airwayIdent. */
    private String airwayIdent;

    /** Value for bearingToNext. */
    private Integer bearingToNext;

    /** Value for distanceToNext. */
    private Integer distanceToNext;

    /** Empty constructor. **/
    public RouteSegments() {
        // No-op.
    }

    /** Full constructor. **/
    public RouteSegments(String routeId,
        int sequence,
        String waypointKind,
        String waypointIdent,
        String waypointName,
        BigDecimal latitude,
        BigDecimal longitude,
        String viaAirway,
        String airwayIdent,
        Integer bearingToNext,
        Integer distanceToNext) {
        this.routeId = routeId;
        this.sequence = sequence;
        this.waypointKind = waypointKind;
        this.waypointIdent = waypointIdent;
        this.waypointName = waypointName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.viaAirway = viaAirway;
        this.airwayIdent = airwayIdent;
        this.bearingToNext = bearingToNext;
        this.distanceToNext = distanceToNext;
    }

    /**
     * Gets routeId
     * 
     * @return Value for routeId.
     **/
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets routeId
     * 
     * @param routeId New value for routeId.
     **/
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * Gets sequence
     * 
     * @return Value for sequence.
     **/
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets sequence
     * 
     * @param sequence New value for sequence.
     **/
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    /**
     * Gets waypointKind
     * 
     * @return Value for waypointKind.
     **/
    public String getWaypointKind() {
        return waypointKind;
    }

    /**
     * Sets waypointKind
     * 
     * @param waypointKind New value for waypointKind.
     **/
    public void setWaypointKind(String waypointKind) {
        this.waypointKind = waypointKind;
    }

    /**
     * Gets waypointIdent
     * 
     * @return Value for waypointIdent.
     **/
    public String getWaypointIdent() {
        return waypointIdent;
    }

    /**
     * Sets waypointIdent
     * 
     * @param waypointIdent New value for waypointIdent.
     **/
    public void setWaypointIdent(String waypointIdent) {
        this.waypointIdent = waypointIdent;
    }

    /**
     * Gets waypointName
     * 
     * @return Value for waypointName.
     **/
    public String getWaypointName() {
        return waypointName;
    }

    /**
     * Sets waypointName
     * 
     * @param waypointName New value for waypointName.
     **/
    public void setWaypointName(String waypointName) {
        this.waypointName = waypointName;
    }

    /**
     * Gets latitude
     * 
     * @return Value for latitude.
     **/
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude
     * 
     * @param latitude New value for latitude.
     **/
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets longitude
     * 
     * @return Value for longitude.
     **/
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude
     * 
     * @param longitude New value for longitude.
     **/
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets viaAirway
     * 
     * @return Value for viaAirway.
     **/
    public String getViaAirway() {
        return viaAirway;
    }

    /**
     * Sets viaAirway
     * 
     * @param viaAirway New value for viaAirway.
     **/
    public void setViaAirway(String viaAirway) {
        this.viaAirway = viaAirway;
    }

    /**
     * Gets airwayIdent
     * 
     * @return Value for airwayIdent.
     **/
    public String getAirwayIdent() {
        return airwayIdent;
    }

    /**
     * Sets airwayIdent
     * 
     * @param airwayIdent New value for airwayIdent.
     **/
    public void setAirwayIdent(String airwayIdent) {
        this.airwayIdent = airwayIdent;
    }

    /**
     * Gets bearingToNext
     * 
     * @return Value for bearingToNext.
     **/
    public Integer getBearingToNext() {
        return bearingToNext;
    }

    /**
     * Sets bearingToNext
     * 
     * @param bearingToNext New value for bearingToNext.
     **/
    public void setBearingToNext(Integer bearingToNext) {
        this.bearingToNext = bearingToNext;
    }

    /**
     * Gets distanceToNext
     * 
     * @return Value for distanceToNext.
     **/
    public Integer getDistanceToNext() {
        return distanceToNext;
    }

    /**
     * Sets distanceToNext
     * 
     * @param distanceToNext New value for distanceToNext.
     **/
    public void setDistanceToNext(Integer distanceToNext) {
        this.distanceToNext = distanceToNext;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof RouteSegments))
            return false;
        
        RouteSegments that = (RouteSegments)o;

        if (routeId != null ? !routeId.equals(that.routeId) : that.routeId != null)
            return false;
        

        if (sequence != that.sequence)
            return false;
        

        if (waypointKind != null ? !waypointKind.equals(that.waypointKind) : that.waypointKind != null)
            return false;
        

        if (waypointIdent != null ? !waypointIdent.equals(that.waypointIdent) : that.waypointIdent != null)
            return false;
        

        if (waypointName != null ? !waypointName.equals(that.waypointName) : that.waypointName != null)
            return false;
        

        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null)
            return false;
        

        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null)
            return false;
        

        if (viaAirway != null ? !viaAirway.equals(that.viaAirway) : that.viaAirway != null)
            return false;
        

        if (airwayIdent != null ? !airwayIdent.equals(that.airwayIdent) : that.airwayIdent != null)
            return false;
        

        if (bearingToNext != null ? !bearingToNext.equals(that.bearingToNext) : that.bearingToNext != null)
            return false;
        

        if (distanceToNext != null ? !distanceToNext.equals(that.distanceToNext) : that.distanceToNext != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = routeId != null ? routeId.hashCode() : 0;

        res = 31 * res + (sequence);

        res = 31 * res + (waypointKind != null ? waypointKind.hashCode() : 0);

        res = 31 * res + (waypointIdent != null ? waypointIdent.hashCode() : 0);

        res = 31 * res + (waypointName != null ? waypointName.hashCode() : 0);

        res = 31 * res + (latitude != null ? latitude.hashCode() : 0);

        res = 31 * res + (longitude != null ? longitude.hashCode() : 0);

        res = 31 * res + (viaAirway != null ? viaAirway.hashCode() : 0);

        res = 31 * res + (airwayIdent != null ? airwayIdent.hashCode() : 0);

        res = 31 * res + (bearingToNext != null ? bearingToNext.hashCode() : 0);

        res = 31 * res + (distanceToNext != null ? distanceToNext.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "RouteSegments [" + 
            "routeId=" + routeId + ", " + 
            "sequence=" + sequence + ", " + 
            "waypointKind=" + waypointKind + ", " + 
            "waypointIdent=" + waypointIdent + ", " + 
            "waypointName=" + waypointName + ", " + 
            "latitude=" + latitude + ", " + 
            "longitude=" + longitude + ", " + 
            "viaAirway=" + viaAirway + ", " + 
            "airwayIdent=" + airwayIdent + ", " + 
            "bearingToNext=" + bearingToNext + ", " + 
            "distanceToNext=" + distanceToNext +
        "]";
    }
}