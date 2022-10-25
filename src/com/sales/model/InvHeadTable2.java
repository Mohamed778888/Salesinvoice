package com.sales.model;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvHeadTable2 extends AbstractTableModel {
    private ArrayList<InvoiceHeader10> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public InvHeadTable2(ArrayList<InvoiceHeader10> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader10 invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getIdNumber();
            case 1: return invoice.getInvoiceDate();
            case 2: return invoice.getCustomerName();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}