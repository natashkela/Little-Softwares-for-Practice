package entities;

public class Charcount {
	String word;
	
	public Charcount(String word){
		this.word=word;
	}
	
	public int wordLength(){
		return word.length();
	}
}
