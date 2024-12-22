package com.antonio.course.springboot.di.invoice.springboot_di_invoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.antonio.course.springboot.di.invoice.springboot_di_invoice.models.Item;
import com.antonio.course.springboot.di.invoice.springboot_di_invoice.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

  @Bean
  List<Item> itemsInvoice() {
    Product product1 = new Product("Camara Sony", 100);
    Product product2 = new Product("Bicicleta Bianchi aro 26", 200);
    List<Item> items = Arrays.asList(new Item(product1, 2), new Item(product2, 4));
    return items;
  }

}
