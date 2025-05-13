package com.example.pedidoapi.service;

import com.example.pedidoapi.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final PedidoRepository repository;
    private final ModelMapper mapper;
}
