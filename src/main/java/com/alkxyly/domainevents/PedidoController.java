package com.alkxyly.domainevents;

import com.alkxyly.domainevents.event.PedidoConfirmadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido criarPedido(){
        publisher.publishEvent(new PedidoConfirmadoEvent(new Pedido()));
       return  this.pedidoService.criarPedido();

    }
}
