package dev.bustillos.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@RestController
	@RequestMapping("/kafka")
	class KafkaController {
		private MessageProducer service;

		public KafkaController(MessageProducer service) {
			this.service = service;
		}

		@GetMapping("/send/{message}")
		public String send(@PathVariable("message") String message) {
			service.sendMessage(message);
			return "Enviado: " + message;
		}
	}
}
