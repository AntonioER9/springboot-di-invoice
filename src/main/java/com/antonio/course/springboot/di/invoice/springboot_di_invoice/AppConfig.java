package com.antonio.course.springboot.di.invoice.springboot_di_invoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.antonio.course.springboot.di.invoice.springboot_di_invoice.models.Item;
import com.antonio.course.springboot.di.invoice.springboot_di_invoice.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

  @Bean
  List<Item> itemsInvoice() {
    Product product1 = new Product("Camara Sony", 100);
    Product product2 = new Product("Bicicleta Bianchi aro 26", 200);
    List<Item> items = Arrays.asList(new Item(product1, 2), new Item(product2, 4));
    return items;
  }

  @Bean
  @Primary
  List<Item> itemsInvoiceOffice() {
    Product product3 = new Product("Notebook Asus", 500);
    Product product4 = new Product("Impresora HP Multifuncional", 80);
    List<Item> items = Arrays.asList(new Item(product3, 2), new Item(product4, 4));
    return items;
  }

}
