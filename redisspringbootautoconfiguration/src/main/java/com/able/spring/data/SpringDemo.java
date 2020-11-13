package com.able.spring.data;


import com.able.spring.data.configuration.RedisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringDemo {

	private String aa="aa";

	private String bb = "bb";

	public void getDemo(){
		System.out.println(aa+","+bb);
	}

}
