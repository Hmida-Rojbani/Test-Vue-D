package de.tekup.vue.dto.models;

import lombok.Getter;

@Getter
public enum Profession {
	DEVELOPPER("Developper"), TESTER("Tester"), 
	ARCHITECT("Architect"), MANAGER("Manager");
	
	private String displayValue;
	
	private Profession(String displayValue) {
		this.displayValue =displayValue;
	}
	
	

}
