/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooiframeexercises;   
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 extends JFrame{
    
    public Ex03(){
        this.setTitle("Java");
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton botaoA = new JButton("Botão 1");
        JButton botaoB = new JButton("Botão 2");
        JButton botaoC = new JButton("Botão 3");
         
        botaoA.setToolTipText("Habilita Botão 2"); 
        botaoB.setToolTipText("Habilita Botão 3");
        botaoC.setToolTipText("Habilita Botão 1");
        
        setLayout( new FlowLayout());
        
        add(botaoA);
        add(botaoB);
        add(botaoC);
        
        botaoB.setEnabled(false);
        botaoC.setEnabled(false);
        
        botaoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    botaoB.setEnabled(true);
                    botaoA.setEnabled(false);
            }
        });
        botaoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    botaoC.setEnabled(true);
                    botaoB.setEnabled(false);
            }
        });
        botaoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    botaoA.setEnabled(true);
                    botaoC.setEnabled(false);
            }
        });     
    }
}
