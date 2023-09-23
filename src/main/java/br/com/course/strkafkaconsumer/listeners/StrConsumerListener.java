package br.com.course.strkafkaconsumer.listeners;

import br.com.course.strkafkaconsumer.annotation.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @SneakyThrows
    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        log.info("CREATE ::: Recive Message {}", message);
        throw new IllegalArgumentException("Exception");
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message){
        log.info("LOG ::: Recive Message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-2", containerFactory = "validContainerFactory")
    public void history(String message){
        log.info("HISTORY ::: Recive Message {}", message);
    }

}
