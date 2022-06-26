package com.alkxyly.domainevents.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PedidoConfirmadoEventListener {

    @Async
    @EventListener
    public void enviarEmailPedidoCriado(PedidoConfirmadoEvent pedidoEvent){
        System.out.println("ENVIANDO EMAIL: LENDO O EVENTO "+pedidoEvent.getPedido().getId());
    }

    @EventListener
    public void enviarSMSPedidoCriado(PedidoConfirmadoEvent pedidoEvent){
        System.out.println("ENVIANDO SMS: LENDO O EVENTO "+pedidoEvent.getPedido().getId());
    }
}
