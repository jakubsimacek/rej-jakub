package net.sf.rej.jakub;

public class StringContainerHelperImpl implements StringContainerHelper {

	private String string;
	
	public StringContainerHelperImpl(String string) {
		this.string = string;
	}
	
	public String toString() {
		return this.string;
	}
}
