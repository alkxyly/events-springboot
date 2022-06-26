package com.alkxyly.domainevents.event;

import com.alkxyly.domainevents.Pedido;

public class PedidoConfirmadoEvent {

    private Pedido pedido;

    public PedidoConfirmadoEvent(Pedido pedido){
        this.pedido = pedido;

    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
