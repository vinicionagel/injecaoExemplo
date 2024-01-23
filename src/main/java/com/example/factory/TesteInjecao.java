package com.example.factory;

import com.example.service.TesteA;
import com.example.service.TesteB;

public enum TesteInjecao {

    TESTE_A("TesteA") {
        @Override
        public String className() {
            return TesteA.class.getName();

        }

        @Override
        public Class<?> getType() {
            return TesteA.class;
        }
    },
    TESTE_B("TesteB") {
        @Override
        public String className() {
            return TesteB.class.getName();
        }

        @Override
        public Class<?> getType() {
            return TesteB.class;
        }
    };

    private String nome;

    TesteInjecao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String className();

    public abstract Class<?> getType();

    public <T> T realizarCast(Object objeto) {
        if (this.getClass().isInstance(objeto)) {
            return (T) objeto;
        } else {
            throw new IllegalArgumentException("Tipo de cast não é compatível");
        }
    }
}
