package net.sf.rej.jakub;

import net.sf.rej.java.JavaType;

public class StringContainerHelperImpl implements StringContainerHelper {

	private String string;
	
	public StringContainerHelperImpl(String string) {
		this.string = string;
	}
	
	public String getString() {
		return this.string;
	}

	public String toString() {
		return this.string;
	}

	@Override
	public JavaType getJavaType() {
		throw new RuntimeException("StringContainerHelper cannot contain JavaType");
	}
}
