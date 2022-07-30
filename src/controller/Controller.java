/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ArrayListManager;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Jose
 */
public abstract class Controller {

    private static ArrayList<Integer> array;
    public static int sumaElementos;

    public static DefaultTableModel getTableModel(DefaultTableModel tableModel ,int size) {
        array = ArrayListManager.generarAleatorio(size);
        sumaElementos = ArrayListManager.sumaElementos(array);
        int posicion;
        tableModel.setRowCount(0);
        for (int i = 0; i < size; i++) {            
            posicion = i + 1;
            tableModel.addRow(new Object[]{posicion, array.get(i)});
        }
        return tableModel;
    }
}
