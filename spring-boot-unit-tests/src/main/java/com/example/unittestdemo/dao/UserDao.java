package com.example.unittestdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
   public String getUser() {
       return "Tom";
   }
}