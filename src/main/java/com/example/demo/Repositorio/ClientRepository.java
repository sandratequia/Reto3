/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ClientInterface;
import com.example.demo.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author s_a_w
 */

@Repository

public class ClientRepository {
    @Autowired
    private ClientInterface extensionesCrud;
    
    public List<Client>getAll(){
        return(List<Client>)extensionesCrud.findAll();
    }
    
    public Optional<Client>getClient(int id){
        return extensionesCrud.findById(id);
    }
    
    public Client save (Client client){
        return extensionesCrud.save(client);
    }
}
