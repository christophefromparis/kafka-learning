package com.mycompany.kafkalearning;

import com.mycompany.kafkalearning.service.Consumer;
import com.mycompany.kafkalearning.service.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaLearningApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaLearningApplication.class, args);

		new Producer().run();
		new Consumer().run();
	}
}
