package com.cidr.cidrdemo.entity;

import org.springframework.data.annotation.Id;

public class IpAddressEntity {
	
	@Id
	private String ipAddress;
	
	private Boolean isAvaiable = true;

	public String getIpAddress() {
	  return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
	  this.ipAddress = ipAddress;
	}
	
	public Boolean getIsAvaiable() {
	  return isAvaiable;
	}
	
	public void setIsAvaiable(Boolean isAvaiable) {
	  this.isAvaiable = isAvaiable;
	}
}
