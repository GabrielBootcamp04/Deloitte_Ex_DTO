package com.example.pedidoapi.controller;

import com.example.pedidoapi.DTO.PedidoDTO;
import com.example.pedidoapi.entity.Pedido;
import com.example.pedidoapi.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/pedidos")
    public class PedidoController {

    @Autowired
    private PedidoService pedidoService;


    @PostMapping
    public Pedido criarPedido(@RequestBody PedidoDTO dto){
        return pedidoService.salvarPedido(dto);
    }

}
