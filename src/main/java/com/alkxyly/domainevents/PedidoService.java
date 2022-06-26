package com.alkxyly.domainevents;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public Pedido criarPedido(){
        System.out.println("PedidoService: PEDIDO CRIADO COM SUCESSO");
        Pedido pedido = new Pedido();
        return  pedido;
    }
}
