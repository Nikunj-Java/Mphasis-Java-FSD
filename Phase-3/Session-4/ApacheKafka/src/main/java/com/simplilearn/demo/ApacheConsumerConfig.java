package com.simplilearn.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class ApacheConsumerConfig {
	
	@Bean
	public ConsumerFactory<String, String> consumerFactory(){
		
		Map<String, Object> configProp= new HashMap<String, Object>();
		configProp.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		configProp.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProp.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		ConsumerFactory<String, String> factory= 
				new DefaultKafkaConsumerFactory<String, String>(configProp);
		
		return  factory;
	}
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListner(){
		 ConcurrentKafkaListenerContainerFactory<String, String> factory=
				 new ConcurrentKafkaListenerContainerFactory<String, String>();
		 return factory;
	}
}
