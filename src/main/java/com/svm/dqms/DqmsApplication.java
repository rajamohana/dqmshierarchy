package com.svm.dqms;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;




@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.svm.dqms"})
public class DqmsApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	return application.sources(DqmsApplication.class);
    }
	
	public static void main(String[] args) {
		System.out.println("inside man app>>>>>>>");
		SpringApplication.run(DqmsApplication.class, args);
	}

	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
	HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
	fact.setEntityManagerFactory(emf);
	System.out.println("bean created");
	return fact;
	}
}
