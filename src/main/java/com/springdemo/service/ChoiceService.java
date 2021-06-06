package com.springdemo.service;

import com.springdemo.entity.Choice;
import com.springdemo.entity.Inventory;

public interface ChoiceService {

    void saveChoice (Choice theChoice);

    Inventory getInventory();
}
