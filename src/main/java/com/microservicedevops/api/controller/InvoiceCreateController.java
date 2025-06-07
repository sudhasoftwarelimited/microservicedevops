package com.microservicedevops.api.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/microservicedevops/api/v1")
public class InvoiceCreateController {
    List<String> invoiceList = new ArrayList<>();

    @GetMapping("/invoice")
    public List<String> fetchInvoiceList ()
    {
        invoiceList.add("Invoice 1");
        invoiceList.add("Invoice 2");
        return invoiceList;
    };

    @PostMapping("/invoice")
    public String invoice (@Valid @RequestBody String invoice)
    {
        return "Add new " + invoice;
    };

    // Delete operation
    @DeleteMapping("/departments/{id}")

    public String deleteInvoiceById(@PathVariable("id")
                                               Long invoiceId)
    {
        return "Invoice with id : " + invoiceId + "deleted successfully";
    }
}

