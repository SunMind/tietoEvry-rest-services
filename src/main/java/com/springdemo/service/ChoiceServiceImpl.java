package com.springdemo.service;

import com.springdemo.dao.DAO;
import com.springdemo.entity.Choice;
import com.springdemo.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoiceServiceImpl implements ChoiceService {

    @Autowired
    private DAO choiceDAO;

    @Override
    public void saveChoice(Choice theChoice) {
        choiceDAO.saveChoice(theChoice);
    }

    @Override
    public Inventory getInventory() {
        return choiceDAO.getInventory();
    }
}
