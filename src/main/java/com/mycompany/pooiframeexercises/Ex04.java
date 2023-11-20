/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooiframeexercises;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex04 extends JFrame{
    
    JLabel labelA,labelB,labelResult;
    JButton btnSum,btnSub,btnTimes,btnDiv;
    TextField fieldA,fieldB,fieldResult;
    
    public Ex04(){
        this.setTitle("EX04 - Calculadora");
        this.setSize(250, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelA = new JLabel("Num1");
        labelB = new JLabel("Num2");
        labelResult = new JLabel("Resultado");
        
        fieldA = new TextField();
        fieldB = new TextField();
        fieldResult = new TextField();

        btnSum = new JButton("+");
        btnSub = new JButton("-");
        btnTimes = new JButton("*");
        btnDiv = new JButton("/");
        
        
        setLayout(new GridLayout(6,3)); 
        add(labelA);
        add(fieldA);
        add(labelB);
        add(fieldB);

        add(btnSum);
        add(btnSub);
        add(btnTimes);
        add(btnDiv);
        
        add(labelResult);
        add(fieldResult);
        fieldResult.setEditable(false);
        
        
        btnSum.addActionListener((ActionEvent e) -> {
            defineOperation(1);
        });
        btnSub.addActionListener((ActionEvent e) -> {
            defineOperation(2);
        });
        btnTimes.addActionListener((ActionEvent e) -> {
            defineOperation(3);
        });
        btnDiv.addActionListener((ActionEvent e) -> {
            defineOperation(4);
        });
    }
    
    public void defineOperation(int operation){
        
        float numberA = Float.parseFloat(fieldA.getText());
        float numberB = Float.parseFloat(fieldB.getText());
        float result = 0; 
        
        switch(operation){
            case 1:
                result= numberA + numberB;
                break;
            case 2:
                result= numberA - numberB;
                break;
            case 3:
                result= numberA * numberB;
                break;
            case 4:
                result= numberA / numberB;
                break;
            default:
                break;
        }
        
        fieldResult.setText(Float.toString(result));
        
        
    }
}
