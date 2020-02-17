package com.springframeworktraining.springgenericresttemplate;

import com.springframeworktraining.springgenericresttemplate.service.ServiceCallImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGenericRestTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringGenericRestTemplateApplication.class, args);

		ServiceCallImpl serviceCall = context.getBean(ServiceCallImpl.class);

		System.out.println("\n*****************************");
		System.out.println("******** POST ID 42 *********");
		System.out.println("*****************************\n");
		System.out.println(serviceCall.sampleGetServiceCallWithObjResponse());
		System.out.println("\n****************************");
		System.out.println("******** ALL POSTS *********");
		System.out.println("****************************\n");
		System.out.println(serviceCall.sampleGetServiceCallWithStringResponse());
	}

}
