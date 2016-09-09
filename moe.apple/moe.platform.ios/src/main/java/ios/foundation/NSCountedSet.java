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

package ios.foundation;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCountedSet<_ObjectType> extends NSMutableSet<_ObjectType> {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCountedSet(Pointer peer) {
		super(peer);
	}

	/**
	 * addObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/addObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCountedSet<?> alloc();

	/**
	 * countForObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/countForObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("countForObject:")
	@NUInt
	public native long countForObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	@Generated
	@Selector("init")
	public native NSCountedSet<?> init();

	/**
	 * initWithArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/initWithArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithArray:")
	public native NSCountedSet<?> initWithArray(NSArray<_ObjectType> array);

	/**
	 * initWithCapacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/initWithCapacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCapacity:")
	public native NSCountedSet<?> initWithCapacity(@NUInt long numItems);

	@Generated
	@Selector("initWithCoder:")
	public native NSCountedSet<?> initWithCoder(NSCoder aDecoder);

	@Generated
	@Variadic()
	@Selector("initWithObjects:")
	public native NSCountedSet<?> initWithObjects(
			@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSCountedSet<?> initWithObjectsCount(
			ConstPtr<_ObjectType> objects, @NUInt long cnt);

	/**
	 * initWithSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/initWithSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSet:")
	public native NSCountedSet<?> initWithSet(NSSet<_ObjectType> set);

	@Generated
	@Selector("initWithSet:copyItems:")
	public native NSCountedSet<?> initWithSetCopyItems(NSSet<_ObjectType> set, boolean flag);

	/**
	 * objectEnumerator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/objectEnumerator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator<_ObjectType> objectEnumerator();

	/**
	 * removeObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCountedSet_Class/index.html#//apple_ref/occ/instm/NSCountedSet/removeObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	@Generated
	@Selector("set")
	public static native <_ObjectType> NSCountedSet<?> set();

	@Generated
	@Selector("setWithArray:")
	public static native <_ObjectType> NSCountedSet<?> setWithArray(NSArray<_ObjectType> array);

	@Generated
	@Selector("setWithCapacity:")
	public static native <_ObjectType> NSCountedSet<?> setWithCapacity(@NUInt long numItems);

	@Generated
	@Selector("setWithObject:")
	public static native <_ObjectType> NSCountedSet<?> setWithObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	@Generated
	@Variadic()
	@Selector("setWithObjects:")
	public static native <_ObjectType> NSCountedSet<?> setWithObjects(
			@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

	@Generated
	@Selector("setWithObjects:count:")
	public static native <_ObjectType> NSCountedSet<?> setWithObjectsCount(
			ConstPtr<_ObjectType> objects, @NUInt long cnt);

	@Generated
	@Selector("setWithSet:")
	public static native <_ObjectType> NSCountedSet<?> setWithSet(NSSet<_ObjectType> set);

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}