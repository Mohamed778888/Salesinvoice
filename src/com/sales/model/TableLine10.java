
package com.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableLine10 extends AbstractTableModel {

    private ArrayList<ClassLiner1> linesObj;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public TableLine10(ArrayList<ClassLiner1> lines) {
        this.linesObj = lines;
    }
    public ArrayList<ClassLiner1> getLines() {
        return linesObj;
    }
    
    @Override
    public int getRowCount() {
        return linesObj.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClassLiner1 X = linesObj.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return X.getInvoice().getIdNumber();
            case 1: return X.getLineItem();
            case 2: return X.getLinePrice();
            case 3: return X.getLineCount();
            case 4: return X.getLineTotal();
            default : return "";
        }
    }
    
}