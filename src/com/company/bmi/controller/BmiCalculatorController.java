package com.company.bmi.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BmiCalculatorController {
    public TextField weightTextField;
    public TextField heightTextField;
    public Label idBmi;
    public Label alert;


    public void clickOnAction(ActionEvent actionEvent) {

        double weight = Double.parseDouble((weightTextField.getText()));
        double height = Double.parseDouble((heightTextField.getText()));

      double  bmi = weight/((height)*(height));

        if (bmi < 18.5) {
            alert.setText("Underweight..!");
            idBmi.setText("Your BMI is: "+bmi+ " kg/m2");
//            System.out.println("Your BMI is [Underweight] : "+ bmi + " kg/m2");
        }
        else if (bmi < 25) {
//            System.out.println("Good!!  Your BMI is [Normal] : "+ bmi + " kg/m2");
            alert.setText("Normal..!");
            idBmi.setText("Your BMI is: "+bmi+ " kg/m2");
        }
        else if (bmi < 30) {
            alert.setText("Overweight!!!  ");
            idBmi.setText("Your BMI is: "+bmi+ " kg/m2");
            System.out.println("Warning!!! Your BMI is [Overweight] : "+ bmi + " kg/m2");
        }
        else {
            System.out.println("Warning!!! Your BMI is [Obese] : "+ bmi + " kg/m2");
            alert.setText("Obese!!!  ");
            idBmi.setText("Your BMI is: "+bmi+ " kg/m2");
        }

    }
}
