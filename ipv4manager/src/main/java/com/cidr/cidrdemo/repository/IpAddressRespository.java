package com.cidr.cidrdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cidr.cidrdemo.entity.IpAddressEntity;

@Repository
public interface IpAddressRespository extends MongoRepository<IpAddressEntity, String>{
	
}
