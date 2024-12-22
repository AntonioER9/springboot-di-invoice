package com.antonio.course.springboot.di.invoice.springboot_di_invoice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonio.course.springboot.di.invoice.springboot_di_invoice.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

  @Autowired
  private Invoice invoice;

  @GetMapping("/show")
  public Invoice show() {
    return invoice;
  }

}
