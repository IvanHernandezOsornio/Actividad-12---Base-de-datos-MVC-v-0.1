/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelAgenda;
import views.viewAgenda;
import controllers.ControllerAgenda;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelAgenda modelAgenda = new ModelAgenda();
        viewAgenda viewAgenda = new viewAgenda();
        ControllerAgenda controllerAgenda = new ControllerAgenda(modelAgenda, viewAgenda);
    }
    
}
