package com.example.controller;

import com.example.factory.TesteInjecao;
import com.example.service.TesteInjecaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class ControllerTest {
    //Ajudou --> https://medium.com/edureka/what-is-dependency-injection-5006b53af782
    private final TesteInjecaoService testeInjecao;

    public ControllerTest(TesteInjecaoService testeInjecao) {
        this.testeInjecao = testeInjecao;
    }

    @RequestMapping(value = "/injetar1", method = RequestMethod.GET)
    @ResponseBody
    public String testInjecaoDependenciaComEnum(@RequestParam("teste") TesteInjecao teste) {
        return this.testeInjecao.injetarComEnum(teste);
    }

    @RequestMapping(value = "/injetar2", method = RequestMethod.GET)
    @ResponseBody
    public String testInjecaoDependenciaComEnumPorNome(@RequestParam("teste") TesteInjecao teste) {
        return this.testeInjecao.injetarPeloNome(teste);
    }
}
