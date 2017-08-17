package org.custompropertyeditor;

import java.beans.PropertyEditorSupport;

public class ApplicantNameCustomEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		if (name.startsWith("Mr") || name.startsWith("Ms")) {
			setValue(name);
		} else {
			name = "Mr " + name;
			setValue(name);
		}
	}
}
