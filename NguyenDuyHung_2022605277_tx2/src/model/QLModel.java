/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author H
 */
public class QLModel implements ComputerManager{
    private ArrayList<Computer> listComputer;
    public String luaChon;
    

    public QLModel() {
        this.listComputer = new ArrayList<Computer>();
        
    }

    public QLModel(ArrayList<Computer> listComputer) {
        this.listComputer = listComputer;
    }

    public ArrayList<Computer> getListComputer() {
        return listComputer;
    }

    public void setListComputer(ArrayList<Computer> listComputer) {
        this.listComputer = listComputer;
    }

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }

    
    @Override
    public boolean addComputer(Computer c) {
        return listComputer.add(c);
    }

    @Override
    public boolean editComputer(Computer c) {
         return true;
    }

    @Override
    public boolean delComputer(Computer c) {
       listComputer.remove(c);
       return true;
      
    }

    @Override
    public ArrayList<Computer> searchComputer(String name) {
       ArrayList<Computer> newlist = new ArrayList<>();
        for (int i = 0; i < listComputer.size(); i++) {
            if (listComputer.get(i).getProduct_name().equalsIgnoreCase(name)) {
                newlist.add(listComputer.get(i));
            }
        }
        return newlist;
    }

    @Override
    public ArrayList<Computer> sortedComputer(double price) {
       Collections.sort(listComputer, Comparator.comparingDouble(Computer::getProduct_price));
        return listComputer;
    }

 
    public static void main(String args[]){
        
    }
    
    
}
