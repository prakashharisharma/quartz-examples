package com.tutorialsdesk.quartz.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorialsdesk.quartz.mq.Sender;

@Configuration
public class RabbitConfig {

	@Bean
    public Queue queue() {
        return new Queue("task");
    }
	
	@Bean
	public Sender sender(){
		return new Sender();
	}
	
	/*@Bean
	public Receiver receiver(){
		return new Receiver();
	}*/
	
}
