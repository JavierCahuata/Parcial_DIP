package com.cahuata.ads.parcial;

public class Copier {
	private ISaver saver;
	public static boolean scannerFlag = false;	

	public Copier(ISaver saver){
		this.saver = saver;
	}

	public void copy() throws Exception {
		String inputValue = "";
		while (!(inputValue = (scannerFlag ? Scanner.read() : Keyboard.read())).equals("-1")) {
			saver.copy(inputValue);
		}
	}
}






