/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author s_a_w
 */
public interface CategoryInterface extends CrudRepository<Category, Integer>{
    
}
