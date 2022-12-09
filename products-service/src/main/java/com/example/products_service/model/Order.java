package com.example.products_service.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class Order {

    @Id
    private String id;

    private long clientId;

    private String productName;

    private Double productPrice;

    private Date date= new Date();

    public void setDate(Date date) {
        this.date = new Date();
    }
}
