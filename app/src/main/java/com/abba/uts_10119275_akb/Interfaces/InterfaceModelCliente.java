package com.abba.uts_10119275_akb.Interfaces;

import com.abba.uts_10119275_akb.Models.Cliente;

import java.util.ArrayList;

public interface InterfaceModelCliente {

    void insertClient(String ruc,String nombre, String direccion, String razon);

    ArrayList<Cliente> getAllClient();

    void updateClient(String id,String ruc,String nombre, String direccion, String razon);

    void deleteClient(String id,String name);

}
