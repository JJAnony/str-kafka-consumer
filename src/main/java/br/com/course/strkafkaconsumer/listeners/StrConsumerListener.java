package br.com.course.strkafkaconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "str-topic")
    public void listner(String message){
        log.info("Recive Message {}", message);
    }

}