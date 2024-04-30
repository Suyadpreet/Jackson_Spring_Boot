package com.suyad;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Customer 
{
	private Integer Id;
	private String name;
	private String email;
	private Long phno;
	private AddressClass addr;
}
