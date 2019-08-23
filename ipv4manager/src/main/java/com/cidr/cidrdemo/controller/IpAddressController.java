package com.cidr.cidrdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cidr.cidrdemo.entity.IpAddressEntity;
import com.cidr.cidrdemo.service.IpAddressService;
import com.cidr.cidrdemo.util.CidrUtil;

@RestController
public class IpAddressController {
	
	@Autowired
	private IpAddressService ipAddressService;
	
	@PostMapping("/ipaddress")
	public HttpStatus createIpAddress(@RequestBody String cidr) {
		CidrUtil cidrUtil = new CidrUtil();
		String[] ipAddresses = cidrUtil.cidrToIPConverter(cidr);
		ipAddressService.create(Arrays.asList(ipAddresses));
		
		return HttpStatus.OK;
	}
	
	@GetMapping("/getall")
	public List<IpAddressEntity> getAll() {
		return ipAddressService.getAll();
	}
	
	@PutMapping("/acquire")
	public boolean acquire(String ipAddress) {
		return ipAddressService.aquireIpAddress(ipAddress);
	}
	
	@PutMapping("/release")
	public boolean release(String ipAddress) {
		return ipAddressService.relaseIpAddress(ipAddress);
	}
}
