package com.alkxyly.domainevents;

import com.alkxyly.domainevents.event.PedidoConfirmadoEvent;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Pedido extends AbstractAggregateRoot<Pedido> {

    private String id;
    private LocalDateTime dataCriacao;

    Pedido(){
        this.id = UUID.randomUUID().toString();
        dataCriacao = LocalDateTime.now();
    }

    public void confirmar(){
        registerEvent(new PedidoConfirmadoEvent(this));
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id.equals(pedido.id) && dataCriacao.equals(pedido.dataCriacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataCriacao);
    }
}
