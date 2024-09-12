package com.mathvieira.doctor.api.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class RabbitMQConfig {

    @Bean
    public Queue doctorQueue() {
        return new Queue("doctor.queue");
    }

    @Bean
    public Queue patientQueue() {
        return new Queue("patient.queue");
    }
}
