package com.cidr.cidrdemo.service;

import java.util.List;

import com.cidr.cidrdemo.entity.IpAddressEntity;

public interface IpAddressService {
	
	public void create(List<String> entities);
	
	public IpAddressEntity get(String ipAddress);
	
	public List<IpAddressEntity> getAll();
	
	public boolean aquireIpAddress(String ipAddress);
	
	public boolean relaseIpAddress(String ipAddress);
}
