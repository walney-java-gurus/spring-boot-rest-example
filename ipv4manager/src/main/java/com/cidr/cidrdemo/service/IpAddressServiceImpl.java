package com.cidr.cidrdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidr.cidrdemo.entity.IpAddressEntity;
import com.cidr.cidrdemo.repository.IpAddressRespository;

@Service
public class IpAddressServiceImpl implements IpAddressService {

  @Autowired
  private IpAddressRespository ipAddressRepository;
  
  @Override
  public void create(List<String> entities) {
	IpAddressEntity entity;
	for (String s : entities) {
		entity = new IpAddressEntity();
		entity.setIpAddress(s);
		ipAddressRepository.save(entity);
	}
  }

  @Override
  public IpAddressEntity get(String ipAddress) {
    return ipAddressRepository.findById(ipAddress).get();
  }
  
  @Override
  public List<IpAddressEntity> getAll() {
	  return ipAddressRepository.findAll();
  }

  @Override
  public boolean aquireIpAddress(String ipAddress) {
	IpAddressEntity entity = ipAddressRepository.findById(ipAddress).get();
	if (entity != null) {
		entity.setIsAvaiable(false);
		ipAddressRepository.save(entity);
	}
    return true;
  }

  @Override
  public boolean relaseIpAddress(String ipAddress) {
	  IpAddressEntity entity = ipAddressRepository.findById(ipAddress).get();
		if (entity != null) {
			entity.setIsAvaiable(true);
			ipAddressRepository.save(entity);
		}
	    return true;
  }
}
