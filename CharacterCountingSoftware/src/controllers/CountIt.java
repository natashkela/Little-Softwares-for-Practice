package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import boundary.Window;
import entities.Charcount;

public class CountIt implements ActionListener{
	Charcount model;
	Window app;
	public CountIt(Charcount mod, Window app){
		this.model=mod;
		this.app=app;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = app.getString();
		Charcount charcount = new Charcount(word);
		int num = charcount.wordLength();
		app.setLabel(num);
	}
	
}
