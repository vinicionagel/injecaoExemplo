package com.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("TesteA")
public class TesteA implements Teste {

    @Override
    public String run() {
        System.out.println("OIE A");
        return "Teste A";
    }
}
