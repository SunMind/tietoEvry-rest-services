package com.springdemo.dao;

import com.springdemo.entity.Choice;
import com.springdemo.entity.Inventory;

public interface DAO {

    void saveChoice (Choice theChoice);

    Inventory getInventory();
}
