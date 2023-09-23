package br.com.course.strkafkaconsumer.model;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class Payment implements Serializable {
    private static final long serialVersionUID = 4338428023056169978L;
    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
