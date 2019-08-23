package com.cidr.cidrdemo.util;

import org.apache.commons.net.util.SubnetUtils;

public class CidrUtil {
	
	public String[] cidrToIPConverter(String cidr) {
		//String subnet = "192.168.0.3/24";
		SubnetUtils utils = new SubnetUtils(cidr);
		String[] ips = utils.getInfo().getAllAddresses();
		//for (int i=0; i <ips.length; i++) {
		//	System.out.println("IP: " + ips[i]);
		//}
		return ips;
	}
	
	public static void main(String[] args) {
		CidrUtil c = new CidrUtil();
		c.cidrToIPConverter("192.168.0.3/24");
	}
}
