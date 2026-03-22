package com.codewithmosh.store.order;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final PaymentService paymentService;

//    @Value("${spring.jpa.hibernate.ddl-auto}")
//    private String dbUpdate;
//
//    @Value("${spring.jpa.properties.hibernate.format_sql}")
//    private String printSql;
//
//    @Value("${spring.datasource.url}")
//    private String appName;
//
//    @Value("${stripe.supported-currencies}")
//    private List<String> supportedCurrencies;

    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println(">>>>>>>> Order Service Created <<<<<<<<<<");
//        System.out.println("DB Update: " + dbUpdate);
//        System.out.println("Print SQL: " + printSql);
//        System.out.println("App Name: " + appName);
//        System.out.println("Currencies: " +supportedCurrencies);
    }

    @PostConstruct
    public void init(){
        System.out.println(">>>>>>> Order Service PostConstruct <<<<<<<<<");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println(">>>>>>>> Order Service PreDestroy <<<<<<<<<");
    }

    public void placeOrder(){
        paymentService.processPayment(50);

    }
}
