package com.example.pedidoapi.repository;


import com.example.pedidoapi.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
