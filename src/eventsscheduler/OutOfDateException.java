/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsscheduler;

import javax.swing.JOptionPane;

/**
 *
 * @author Ashiqul hoque chowdh
 */
public class OutOfDateException extends Exception {
    OutOfDateException(){
    JOptionPane.showMessageDialog(null, "Date And Time is invalid ");
    }
}
