package com.uniyaz.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KategoriDao {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void addKategori (String kategoriAdi){
        try {
            connection = DataBaseConnection.getConnection();
            String sql = "INSERT INTO kategori (name) VALUES (?) ";
            ps = connection.prepareStatement(sql);
            ps.setString(1,kategoriAdi);
            ps.executeUpdate();
        }catch (SQLException hata){
            throw new RuntimeException(hata);
        }catch (ClassNotFoundException hata){
            throw new RuntimeException(hata);
        }
    }
}
