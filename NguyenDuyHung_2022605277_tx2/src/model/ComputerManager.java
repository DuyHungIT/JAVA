/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author H
 */
public interface ComputerManager {
    public boolean addComputer(Computer c);
    
    public boolean editComputer(Computer c);
    
    public boolean delComputer(Computer c);
    
    public ArrayList<Computer> searchComputer(String name);
    
    public ArrayList<Computer> sortedComputer(double price);
}
