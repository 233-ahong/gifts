package com.example.demo.dao.impl;

import com.example.demo.dao.IAdminDao;
import com.example.demo.domain.Admin;

import java.util.List;

public class AdminDaoImpl implements IAdminDao {
    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public void saveAdmin(Admin admin) {
        System.out.println(123);
    }
}
