package com.inter.controller;

import com.inter.model.inter.PrintDriver;
import com.inter.model.vo.SamSongPrint;

public class InterfaceController {

	public void interfaceController() {
		
		//PrintDriver pd=new PrintDriver();
		PrintDriver pd=new SamSongPrint();
		System.out.println(pd.TEST);
		
		
	}
	
	
}
