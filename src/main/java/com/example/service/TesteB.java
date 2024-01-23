package com.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("TesteB")
public class TesteB implements Teste {

    @Override
    public String run() {
        System.out.println("OIE B");
        return "Teste B";
    }
}
