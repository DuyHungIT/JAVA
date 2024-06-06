/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Computer;
import model.QLModel;
import view.MainView;

/**
 *
 * @author H
 */
public class ComputerController implements ActionListener {

    public MainView mainview;
    public QLModel model;

    public ComputerController(MainView mainview) {
        this.mainview = mainview;
    }

    public ComputerController(QLModel model) {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();
        

        //THÊM 
        try {
            if (actionCommand.equalsIgnoreCase("ADD")) {
                this.mainview.deleteInformation();
                this.mainview.model.setLuaChon("ADD");

            } else if (actionCommand.equalsIgnoreCase("EDIT")) {
                this.mainview.model.setLuaChon("EDIT");
                this.mainview.outputInformation();
            } else if (actionCommand.equalsIgnoreCase("Save")) {
                //       get dữ liệu ra
                int id = Integer.parseInt(this.mainview.getjTextField_ID().getText());
                String name = this.mainview.getjTextField_Name().getText();
                float price = Float.parseFloat(this.mainview.getjTextField_Price().getText());
                int total = Integer.parseInt(this.mainview.getjTextField_Total().getText());
                float ram = Float.parseFloat(this.mainview.getjTextField_Memoryram().getText());
                String brand = this.mainview.getjTextField_Brand().getText();
                float fan = Float.parseFloat(this.mainview.getjTextField_Fanspeed().getText());
                
                Computer c = new Computer(ram, brand, fan, id,
                        name, price, total);

                if (this.mainview.model.getLuaChon().equalsIgnoreCase("") || this.mainview.model.getLuaChon().equalsIgnoreCase("ADD")) {
                    this.mainview.addInformation(c);

                } else if (this.mainview.model.getLuaChon().equalsIgnoreCase("EDIT")) {
                    this.mainview.editInformation(c);
                    
                }
            } else if (actionCommand.equalsIgnoreCase("DELETE")) {
                this.mainview.DeleteInformation();
            } else if(actionCommand.equalsIgnoreCase("Find")){
                this.mainview.findInformation();
            }else if(actionCommand.equalsIgnoreCase("Sort")){
                this.mainview.sortInformation();
            }

        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

}
