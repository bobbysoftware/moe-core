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

package ios.networkextension;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSDictionary;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEFilterControlProvider extends NEFilterProvider {
	static {
		NatJ.register();
	}

	@Generated
	protected NEFilterControlProvider(Pointer peer) {
		super(peer);
	}

	/**
	 * URLAppendStringMap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instp/NEFilterControlProvider/URLAppendStringMap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLAppendStringMap")
	public native NSDictionary<String, String> URLAppendStringMap();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NEFilterControlProvider alloc();

	/**
	 * handleNewFlow:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instm/NEFilterControlProvider/handleNewFlow:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("handleNewFlow:completionHandler:")
	public native void handleNewFlowCompletionHandler(NEFilterFlow flow,
			@ObjCBlock(name = "call_handleNewFlowCompletionHandler") Block_handleNewFlowCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_handleNewFlowCompletionHandler {
		@Generated
		void call_handleNewFlowCompletionHandler(NEFilterControlVerdict arg0);
	}

	/**
	 * handleRemediationForFlow:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instm/NEFilterControlProvider/handleRemediationForFlow:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("handleRemediationForFlow:completionHandler:")
	public native void handleRemediationForFlowCompletionHandler(NEFilterFlow flow,
			@ObjCBlock(name = "call_handleRemediationForFlowCompletionHandler") Block_handleRemediationForFlowCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_handleRemediationForFlowCompletionHandler {
		@Generated
		void call_handleRemediationForFlowCompletionHandler(NEFilterControlVerdict arg0);
	}

	@Generated
	@Selector("init")
	public native NEFilterControlProvider init();

	/**
	 * notifyRulesChanged</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instm/NEFilterControlProvider/notifyRulesChanged">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notifyRulesChanged")
	public native void notifyRulesChanged();

	/**
	 * remediationMap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instp/NEFilterControlProvider/remediationMap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("remediationMap")
	public native NSDictionary<String, ? extends NSDictionary<String, ? extends NSObject>> remediationMap();

	/**
	 * remediationMap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instp/NEFilterControlProvider/remediationMap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRemediationMap:")
	public native void setRemediationMap(NSDictionary<String, ? extends NSDictionary<String, ? extends NSObject>> value);

	/**
	 * URLAppendStringMap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterControlProviderClassRef/index.html#//apple_ref/occ/instp/NEFilterControlProvider/URLAppendStringMap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURLAppendStringMap:")
	public native void setURLAppendStringMap(NSDictionary<String, String> value);

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
	@Selector("version")
	@NInt
	public static native long version_static();
}