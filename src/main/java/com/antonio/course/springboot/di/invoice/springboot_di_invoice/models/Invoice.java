package com.antonio.course.springboot.di.invoice.springboot_di_invoice.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
@JsonIgnoreProperties({ "targetSource", "advisors" })
public class Invoice {

  @Autowired
  private Client client;

  @Value("${invoice.description}")
  private String description;

  @Autowired
  private List<Item> items;

  public Invoice() {
    System.out.println("Invoice created: " + description);
    System.out.println(client); // null
    System.out.println(description); // null
  }

  @PostConstruct
  public void init() {
    System.out.println("Invoice created: " + description);
    System.out.println(client); // Antonio Espinoza
    System.out.println(description); // Factura de Compra
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Invoice destroyed: " + description);
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public int getTotal() {
    return items.stream().mapToInt(item -> item.getTotalProduct()).sum();
  }
}
