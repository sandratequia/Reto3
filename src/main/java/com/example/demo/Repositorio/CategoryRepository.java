/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.CategoryInterface;
import com.example.demo.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author s_a_w
 */

@Repository

public class CategoryRepository {
    @Autowired
    private CategoryInterface extensionesCrud;
    
    public List<Category>getAll(){
        return(List<Category>)extensionesCrud.findAll();
    }
    
    public Optional<Category>getCategory(int id){
        return extensionesCrud.findById(id);
    }
    
    public Category save (Category category){
        return extensionesCrud.save(category);
    }
}
