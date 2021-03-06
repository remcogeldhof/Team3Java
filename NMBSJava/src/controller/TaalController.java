package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.LangageHandler;
import panels.TaalPanel;

public class TaalController {
	
	public static void taalListening(TaalPanel t) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				t.getBtnFr().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						LangageHandler.setTaal("Fran�ais");
						GUIController.login();
					}	
				});
				
				t.getBtnEn().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						LangageHandler.setTaal("English");
						GUIController.login();
					}
				});
				
				t.getBtnNl().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						LangageHandler.setTaal("Nederlands");
						GUIController.login();
					}
				});
			}
		});
	}
	
}
