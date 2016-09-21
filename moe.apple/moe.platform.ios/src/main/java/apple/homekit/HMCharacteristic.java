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

package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMCharacteristic extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMCharacteristic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMCharacteristic alloc();

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
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc();

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
    public static native long version();

    @Generated
    @Selector("characteristicType")
    public native String characteristicType();

    @Generated
    @Selector("enableNotification:completionHandler:")
    public native void enableNotificationCompletionHandler(boolean enable,
            @ObjCBlock(name = "call_enableNotificationCompletionHandler") Block_enableNotificationCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMCharacteristic init();

    @Generated
    @Selector("isNotificationEnabled")
    public native boolean isNotificationEnabled();

    @Generated
    @Selector("metadata")
    public native HMCharacteristicMetadata metadata();

    @Generated
    @Selector("properties")
    public native NSArray<String> properties();

    @Generated
    @Selector("readValueWithCompletionHandler:")
    public native void readValueWithCompletionHandler(
            @ObjCBlock(name = "call_readValueWithCompletionHandler") Block_readValueWithCompletionHandler completion);

    @Generated
    @Selector("service")
    public native HMService service();

    @Generated
    @Selector("updateAuthorizationData:completionHandler:")
    public native void updateAuthorizationDataCompletionHandler(NSData data,
            @ObjCBlock(name = "call_updateAuthorizationDataCompletionHandler") Block_updateAuthorizationDataCompletionHandler completion);

    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object value();

    @Generated
    @Selector("writeValue:completionHandler:")
    public native void writeValueCompletionHandler(@Mapped(ObjCObjectMapper.class) Object value,
            @ObjCBlock(name = "call_writeValueCompletionHandler") Block_writeValueCompletionHandler completion);

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableNotificationCompletionHandler {
        @Generated
        void call_enableNotificationCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readValueWithCompletionHandler {
        @Generated
        void call_readValueWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateAuthorizationDataCompletionHandler {
        @Generated
        void call_updateAuthorizationDataCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeValueCompletionHandler {
        @Generated
        void call_writeValueCompletionHandler(NSError arg0);
    }
}