package com.mauricio.springsecurity.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Jwts;

public class TokenUtil {
	private final static  String ACCES_TOKEN="";
	private final static  Long ACCES_TIME = 2_592_00L;
	
	static String crearToken(String nombre, String email) {
		/*
		long expirationTime =ACCES_TIME*1_000;
		Date expitarionDate =new Date(System.currentTimeMillis()+expirationTime);
		Map<String, Object>extra=new HashMap<>();
		extra.put("nombre", nombre);
		return Jwts.builder().setSubject(email)
				.setExpiration(expitarionDate)
				.addClaims(extra)
				.signWith(null, null);

		 */
		return null;
		
	}

}
