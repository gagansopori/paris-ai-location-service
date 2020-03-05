package ai.paris.location.service.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserLocationResponse {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(UserLocationResponse.class);
	
	private String lat;
	private String lon;
	private String countryCode;
	private String region;
	private String regionName;
	private String city;
	private String timezone;
	private String query;
	
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
	
	@Override
	public String toString() {
		return "UserLocationModel [lat=" + lat + ", lon=" + lon + ", countryCode=" + countryCode + ", region=" + region
				+ ", regionName=" + regionName + ", city=" + city + ", timezone=" + timezone + ", query=" + query + "]";
	}
	
	

}
