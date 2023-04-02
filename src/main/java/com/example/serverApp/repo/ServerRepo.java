package com.example.serverApp.repo;

import com.example.serverApp.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress);
}
