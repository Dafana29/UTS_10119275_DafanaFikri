package com.abba.uts_10119275_akb.Interfaces;

import android.os.Bundle;

public interface InterfacePresenterDetail {

    void showAction(String tipo, Bundle bundle);

    void insertClient(String tipo,String ruc,String name, String direccion, String razon);

    void showMessage(String message);

    void updateClient(int id, String ruc,String name, String direcc, String razon);

    void goActivityAdd(Class clase);

    void deleteClient(int id, String name);

    void showErrorRuc();

    void showErrorName();



}
