package com.gabrielglez.gtextfield;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class WindowFrame extends JFrame{
	
	public WindowFrame() {
		
		setSize(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("GTextFieldAutoCompletado por Gabriel González");
		
		GTextField gTextField = new GTextField(0  , 0 , true );
		gTextField.getDataList().add("Gabriel");
		gTextField.getDataList().add("Gerardo");
		gTextField.getDataList().add("Tanausu");
		gTextField.getDataList().add("Tanausu");
		gTextField.getDataList().add("Tanausu");
		gTextField.getDataList().add("Pablo");
		gTextField.getDataList().add("Juan");
		gTextField.getDataList().add("Carlos");
		gTextField.getDataList().add("Mario");
		
		gTextField.setWidthPopupPanel(400);
		gTextField.setHeightPopupPanel(100);
		
		getContentPane().add(gTextField, BorderLayout.NORTH);
	}
	
	

}
