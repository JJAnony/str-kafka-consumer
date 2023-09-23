package br.com.course.strkafkaconsumer.listeners;

import br.com.course.strkafkaconsumer.annotation.PaymentConsumerCustomListener;
import br.com.course.strkafkaconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class PaymentListener {

    @SneakyThrows
    @PaymentConsumerCustomListener(groupId = "create-group")
    public void create(@Payload Payment payment){
        log.info("Receive payment {}", payment);
        Thread.sleep(2000);

        log.info("Validate ...");
        Thread.sleep(2000);

        log.info("Approving payment ...");
        Thread.sleep(2000);
    }

    @SneakyThrows
    @PaymentConsumerCustomListener(groupId = "pdf-group")
    public void pdfGenerator(@Payload Payment payment){
        log.info("Generate PDF paymentId {} ...", payment.getId());
        Thread.sleep(2000);
    }

    @SneakyThrows
    @PaymentConsumerCustomListener(groupId = "mail-group")
    public void sendMail(){
        log.info("Send mail ...");
        Thread.sleep(2000);
    }
}
