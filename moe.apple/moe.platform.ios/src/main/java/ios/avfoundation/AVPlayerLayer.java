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

package ios.avfoundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.quartzcore.CALayer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
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
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerLayer extends CALayer {
	static {
		NatJ.register();
	}

	@Generated
	protected AVPlayerLayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVPlayerLayer alloc();

	@Generated
	@Selector("init")
	public native AVPlayerLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native AVPlayerLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	/**
	 * readyForDisplay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/instp/AVPlayerLayer/readyForDisplay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isReadyForDisplay")
	public native boolean isReadyForDisplay();

	@Generated
	@Selector("layer")
	public static native AVPlayerLayer layer();

	/**
	 * player</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/instp/AVPlayerLayer/player">iOS Dev Center</a>
	 */
	@Generated
	@Selector("player")
	public native AVPlayer player();

	/**
	 * playerLayerWithPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/clm/AVPlayerLayer/playerLayerWithPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerLayerWithPlayer:")
	public static native AVPlayerLayer playerLayerWithPlayer(AVPlayer player);

	/**
	 * player</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/instp/AVPlayerLayer/player">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlayer:")
	public native void setPlayer(AVPlayer value);

	/**
	 * videoGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/instp/AVPlayerLayer/videoGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVideoGravity:")
	public native void setVideoGravity(String value);

	/**
	 * videoGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/instp/AVPlayerLayer/videoGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoGravity")
	public native String videoGravity();

	/**
	 * videoRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerLayer_Class/index.html#//apple_ref/occ/instp/AVPlayerLayer/videoRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoRect")
	@ByValue
	public native CGRect videoRect();

	@Generated
	@Selector("pixelBufferAttributes")
	public native NSDictionary<String, ?> pixelBufferAttributes();

	@Generated
	@Selector("setPixelBufferAttributes:")
	public native void setPixelBufferAttributes(NSDictionary<String, ?> value);

	@Generated
	@Selector("initWithCoder:")
	public native AVPlayerLayer initWithCoder(NSCoder aDecoder);

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