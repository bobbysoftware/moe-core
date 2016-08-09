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

package ios.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.opaque.CGColorRef;
import ios.foundation.NSCoder;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.quartzcore.protocol.CAAction;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CATextLayer extends CALayer {
	static {
		NatJ.register();
	}

	@Generated
	protected CATextLayer(Pointer peer) {
		super(peer);
	}

	/**
	 * alignmentMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/alignmentMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alignmentMode")
	public native String alignmentMode();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CATextLayer alloc();

	/**
	 * font</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/font">iOS Dev Center</a>
	 */
	@Generated
	@Selector("font")
	public native ConstVoidPtr font();

	/**
	 * fontSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/fontSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontSize")
	@NFloat
	public native double fontSize();

	/**
	 * foregroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/foregroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("foregroundColor")
	public native CGColorRef foregroundColor();

	@Generated
	@Selector("init")
	public native CATextLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native CATextLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	/**
	 * wrapped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/wrapped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isWrapped")
	public native boolean isWrapped();

	@Generated
	@Selector("layer")
	public static native CATextLayer layer();

	/**
	 * alignmentMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/alignmentMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlignmentMode:")
	public native void setAlignmentMode(String value);

	/**
	 * font</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/font">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFont:")
	public native void setFont(ConstVoidPtr value);

	/**
	 * fontSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/fontSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFontSize:")
	public native void setFontSize(@NFloat double value);

	/**
	 * foregroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/foregroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setForegroundColor:")
	public native void setForegroundColor(CGColorRef value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setString:")
	public native void setString(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * truncationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/truncationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTruncationMode:")
	public native void setTruncationMode(String value);

	/**
	 * wrapped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/wrapped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWrapped:")
	public native void setWrapped(boolean value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("string")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object string();

	/**
	 * truncationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CATextLayer_class/index.html#//apple_ref/occ/instp/CATextLayer/truncationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("truncationMode")
	public native String truncationMode();

	@Generated
	@Selector("allowsFontSubpixelQuantization")
	public native boolean allowsFontSubpixelQuantization();

	@Generated
	@Selector("setAllowsFontSubpixelQuantization:")
	public native void setAllowsFontSubpixelQuantization(boolean value);

	@Generated
	@Selector("initWithCoder:")
	public native CATextLayer initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("defaultActionForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native CAAction defaultActionForKey(String event);

	@Generated
	@Selector("defaultValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValueForKey(String key);

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("needsDisplayForKey:")
	public static native boolean needsDisplayForKey(String key);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
