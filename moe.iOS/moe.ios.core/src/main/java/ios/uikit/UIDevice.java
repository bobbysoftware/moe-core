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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSUUID;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDevice extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected UIDevice(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIDevice alloc();

	/**
	 * batteryLevel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/batteryLevel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("batteryLevel")
	public native float batteryLevel();

	/**
	 * batteryState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/batteryState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("batteryState")
	@NInt
	public native long batteryState();

	/**
	 * beginGeneratingDeviceOrientationNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instm/UIDevice/beginGeneratingDeviceOrientationNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginGeneratingDeviceOrientationNotifications")
	public native void beginGeneratingDeviceOrientationNotifications();

	/**
	 * currentDevice</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/clm/UIDevice/currentDevice">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentDevice")
	public static native UIDevice currentDevice();

	/**
	 * endGeneratingDeviceOrientationNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instm/UIDevice/endGeneratingDeviceOrientationNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endGeneratingDeviceOrientationNotifications")
	public native void endGeneratingDeviceOrientationNotifications();

	/**
	 * identifierForVendor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/identifierForVendor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("identifierForVendor")
	public native NSUUID identifierForVendor();

	@Generated
	@Selector("init")
	public native UIDevice init();

	/**
	 * batteryMonitoringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/batteryMonitoringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isBatteryMonitoringEnabled")
	public native boolean isBatteryMonitoringEnabled();

	/**
	 * generatesDeviceOrientationNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/generatesDeviceOrientationNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isGeneratingDeviceOrientationNotifications")
	public native boolean isGeneratingDeviceOrientationNotifications();

	/**
	 * multitaskingSupported</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/multitaskingSupported">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMultitaskingSupported")
	public native boolean isMultitaskingSupported();

	/**
	 * proximityMonitoringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/proximityMonitoringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isProximityMonitoringEnabled")
	public native boolean isProximityMonitoringEnabled();

	/**
	 * localizedModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/localizedModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedModel")
	public native String localizedModel();

	/**
	 * model</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/model">iOS Dev Center</a>
	 */
	@Generated
	@Selector("model")
	public native String model();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * orientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/orientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orientation")
	@NInt
	public native long orientation();

	/**
	 * playInputClick</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instm/UIDevice/playInputClick">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playInputClick")
	public native void playInputClick();

	/**
	 * proximityState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/proximityState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("proximityState")
	public native boolean proximityState();

	/**
	 * batteryMonitoringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/batteryMonitoringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBatteryMonitoringEnabled:")
	public native void setBatteryMonitoringEnabled(boolean value);

	/**
	 * proximityMonitoringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/proximityMonitoringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProximityMonitoringEnabled:")
	public native void setProximityMonitoringEnabled(boolean value);

	/**
	 * systemName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/systemName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("systemName")
	public native String systemName();

	/**
	 * systemVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/systemVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("systemVersion")
	public native String systemVersion();

	/**
	 * userInterfaceIdiom</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDevice_Class/index.html#//apple_ref/occ/instp/UIDevice/userInterfaceIdiom">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userInterfaceIdiom")
	@NInt
	public native long userInterfaceIdiom();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
