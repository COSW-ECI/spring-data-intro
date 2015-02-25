/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.springdataintro.components;

import org.springframework.stereotype.Service;

/**
 *
 * @author hcadavid
 */
@Service
public class DummyUserEvaluator implements UserEvaluator{

    @Override
    public boolean reportedUser(int id) {
        return id%2==0;        
    }
    
    
}
