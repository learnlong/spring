package com.tutorialspoint;

public class TextEditor {
	/*private SpellChecker spellChecker;  ���ڹ��캯��ע��
	
	public TextEditor(SpellChecker spellChecker) {
		
		System.out.println("Inside TextEditor constructor");
		
		this.spellChecker=spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}*/
	
	/*private SpellChecker spellChecker;  byname bytype �Զ�װ��
	
	private String  name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		System.out.println(name);
		return name;
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		
		//System.out.println("Inside setSpellChecker." );
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}*/
	
	private SpellChecker spellChecker;
	   private String name;
	   public TextEditor( SpellChecker spellChecker, String name ) {
	      this.spellChecker = spellChecker;
	      this.name = name;
	   }
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public String getName() {
	      return name;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
