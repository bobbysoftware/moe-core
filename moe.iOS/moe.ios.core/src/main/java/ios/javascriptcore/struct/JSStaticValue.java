/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package ios.javascriptcore.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class JSStaticValue extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JSStaticValue() {
		super(JSStaticValue.class);
	}

	@Generated
	protected JSStaticValue(Pointer peer) {
		super(peer);
	}

	@Generated
	public JSStaticValue(
			String name,
			@FunctionPtr(name = "call_getProperty") Function_getProperty getProperty,
			@FunctionPtr(name = "call_setProperty") Function_setProperty setProperty,
			int attributes) {
		super(JSStaticValue.class);
		setName(name);
		setGetProperty(getProperty);
		setSetProperty(setProperty);
		setAttributes(attributes);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String name();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setName(
			String value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setGetProperty(
			@FunctionPtr(name = "call_getProperty") Function_getProperty value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_getProperty {
		@Generated
		VoidPtr call_getProperty(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2, @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg3);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSetProperty(
			@FunctionPtr(name = "call_setProperty") Function_setProperty value);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_setProperty {
		@Generated
		boolean call_setProperty(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2, VoidPtr arg3, @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg4);
	}

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int attributes();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAttributes(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@FunctionPtr(name = "call_getProperty")
	public native Function_getProperty getProperty();

	@Generated
	@StructureField(order = 2, isGetter = true)
	@FunctionPtr(name = "call_setProperty")
	public native Function_setProperty setProperty();
}
