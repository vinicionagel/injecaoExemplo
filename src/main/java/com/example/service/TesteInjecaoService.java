package com.example.service;

import com.example.factory.TesteInjecao;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteInjecaoService {

    private final List<Teste> testes;

    private final ApplicationContext applicationContext;

    public TesteInjecaoService(List<Teste> testes, ApplicationContext applicationContext) {
        this.testes = testes;
        this.applicationContext = applicationContext;
    }

    public String injetarComEnum(TesteInjecao testeInjecao) {
        Teste teste1 = testes.stream().filter(teste -> teste.getClass().getSimpleName().equals(testeInjecao.getNome())).findFirst().orElseThrow();
        return teste1.run();

    }

    public String injetarPeloNome(TesteInjecao teste) {
        Teste bean = (Teste) applicationContext.getBean(teste.getType());
        return bean.run();
    }
}
