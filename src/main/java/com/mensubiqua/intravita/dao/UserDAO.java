package com.mensubiqua.intravita.dao;

import java.io.File;
import java.util.ArrayList;

import com.mensubiqua.intravita.model.User;

public interface UserDAO {

    public void insert(User user);
    public void delete(String nickname, File foto);
    public User find(String nickname);
    public ArrayList<User> selectAll();
    public void update(User user, String rutaFoto, String nickname);
    public void updateRole(String nickname, String rol);
    public void updatePassword(User user);
    public ArrayList<User> search(String cadena);
}
