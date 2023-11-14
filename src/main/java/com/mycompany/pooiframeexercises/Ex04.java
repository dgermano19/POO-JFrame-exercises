/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooiframeexercises;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author T-GAMER
 */
public class Ex04 extends JFrame{
    
    JLabel labelA,labelB,labelResult;
    JButton btnSum,btnSub,btnTimes,btnDiv;
    
    public Ex04(){
        this.setTitle("EX04");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnSum = new JButton("+");
        btnSub = new JButton("-");
        btnTimes = new JButton("*");
        btnDiv = new JButton("/");
        
        setLayout(new GridLayout(3,2)); 
        
        add(btnSub);
        add(btnSum);
        add(btnTimes);
        add(btnDiv);
    }
}
