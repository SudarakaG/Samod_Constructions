/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.custom;

import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author gksde
 */
public class AmountFieldFormat {
    
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    
    public void clearAmountField(JTextField txt) {
        if (!"".equals(txt.getText())) {
            if (Double.parseDouble(txt.getText()) == 0) {
                txt.setText("");
            }
        }
    }

    public void formatDecimalAmount(JTextField txt) {
        if(!"".equals(txt.getText())){
        txt.setText(decimalFormat.format(Double.parseDouble(txt.getText())));
        }
    }
    
}
