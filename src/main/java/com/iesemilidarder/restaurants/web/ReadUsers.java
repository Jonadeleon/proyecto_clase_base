package com.iesemilidarder.restaurants.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadUsers {

    public static User readUsers (String user) throws Exception{
        User rest = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            //sacar el usuario de la base de datos
            Statement stmt = con.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT USU_CODI, USU_NOM, USU_ADRECA_ELECTRONICA FROM USUARIS WHERE USU_CODI = '" +user+"'");

            if (rs.next()){
                rest = new User(rs.getString("USU_NOM"), rs.getString("USU_ADRECA_ELECTRONICA"), rs.getString("USU_CODI"));

                rest.setUser(rs.getString("USU_NOM"));
                rest.setEmail(rs.getString("USU_ADRECA_ELECTRONICA"));
                rest.setCode(rs.getString("USU_CODI"));

            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return rest;
        }

}
