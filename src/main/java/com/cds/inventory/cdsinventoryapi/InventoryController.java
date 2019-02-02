package com.cds.inventory.cdsinventoryapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping(value = "/add")
    public String addInventoryItem(){
        return "Inventory item added";
    }
}
