/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.RoomInterface;
import com.example.demo.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author s_a_w
 */

@Repository

public class RoomRepository {
    @Autowired
    private RoomInterface extensionesCrud;
    
    public List<Room>getAll(){
        return(List<Room>)extensionesCrud.findAll();
    }
    
    public Optional<Room>getRoom(int id){
        return extensionesCrud.findById(id);
    }
    
    public Room save (Room room){
        return extensionesCrud.save(room);
    }
}
