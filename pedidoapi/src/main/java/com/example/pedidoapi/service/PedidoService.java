package com.example.pedidoapi.service;

import com.example.pedidoapi.DTO.PedidoDTO;
import com.example.pedidoapi.entity.Pedido;
import com.example.pedidoapi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoService {
    private final PedidoRepository repository;

    @Autowired
    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido salvarPedido(PedidoDTO dto) {
        if (dto.getValor() == 0.0) {
            throw new IllegalArgumentException("O valor do pedido nao pode ser igual a zero");
        }
        Pedido pedido = new Pedido();
        pedido.setDescricao(dto.getDescricao());
        pedido.setValor(dto.getValor());

        return repository.save(pedido);
    }
}
