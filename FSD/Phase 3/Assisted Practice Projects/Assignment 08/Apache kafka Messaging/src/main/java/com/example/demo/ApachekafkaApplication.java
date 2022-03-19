package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class ApachekafkaApplication 
{
	Logger logger= LoggerFactory.getLogger(Producer.class);
	public static void main(String[] args) 
	{
		SpringApplication.run(ApachekafkaApplication.class, args);
	}
	@KafkaListener(topics = "GENERAL",groupId = "group-id")
	public void consume(String message)
	{
		logger.info("####### message consumed: "+message);
	}
}