package com.tutorialspoint2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	/*private SpellChecker spellChecker;
	set��������ע��
	@Autowired
	public void setSpellCheck(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellcheck() {
		spellChecker.checkspelling();
	}*/
	/*@Autowired
	private SpellChecker spellChecker;
	��ȥsetter�������Զ���������
	public TextEditor() {
		System.out.println("Inside TextEditor constructor");
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkspelling();
	}*/
	
	private SpellChecker spellChecker;
	
	@Autowired    //���캯��ע��
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkspelling();
	}
	
	
	/* private SpellChecker spellChecker;
	   @Resource(name= "spellChecker")
	   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
	   public SpellChecker getSpellChecker(){
	      return spellChecker;
	   }
	   public void spellCheck(){
	      spellChecker.checkSpelling();
	   }*/
}
