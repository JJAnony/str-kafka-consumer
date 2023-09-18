package br.com.course.strkafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class StrKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrKafkaConsumerApplication.class, args);
	}

}
