package net.sf.rej.jakub;

import net.sf.rej.java.JavaType;
import net.sf.rej.java.attribute.ExceptionDescriptor;

public class ExceptionDescriptorContainerHelperImpl implements ExceptionDescriptorContainerHelper {
	ExceptionDescriptor ed;
	JavaType jt;
	
	public ExceptionDescriptorContainerHelperImpl(ExceptionDescriptor ed) {
		this.ed = ed;
	}

	public ExceptionDescriptorContainerHelperImpl(JavaType jt) {
		this.jt = jt;
	}

	/*static public getListOfExceptionDescriptorContainerHelperImpl() {
		
	}*/
	
	@Override
	public JavaType getJavaType() {
		throw new RuntimeException("ExceptionDescriptorContainerHelper cannot contain JavaType");
	/*	if (jt == null)
			throw new RuntimeException("Container does not contain JavaType");
		return jt;*/
	}

	@Override
	public ExceptionDescriptor getExceptionDescriptor() {
		if (ed == null)
			throw new RuntimeException("Container does not contain ExceptionDescriptor");
		return ed;
	}
}
