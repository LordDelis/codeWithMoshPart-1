package com.codewithmosh.store;

import com.codewithmosh.store.entities.Address;
import com.codewithmosh.store.entities.Profile;
import com.codewithmosh.store.entities.Tag;
import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.order.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

//        User user = new User("Fidelis", "delis@gmail.com", "1234");
//        Address address = new Address("Jeba Street", "Yaba", "009900", "Lagos");
//        Tag tag = new Tag("tagger");
//
//        Profile prof = Profile.builder()
//                .bio("Gentle")
//                .phoneNumber("09088887878")
//                .loyaltyPoint(70)
//                .build();
//
//        user.addAddress(address);
//        user.addTag(tag);
//        user.setProfile(prof);
//        System.out.println(user);

	}

}
