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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKMatchmakerViewControllerDelegate;
import apple.uikit.UINavigationController;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatchmakerViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatchmakerViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatchmakerViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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

    @Generated
    @Selector("addPlayersToMatch:")
    public native void addPlayersToMatch(GKMatch match);

    @Generated
    @Deprecated
    @Selector("defaultInvitationMessage")
    public native String defaultInvitationMessage();

    @Generated
    @Selector("init")
    public native GKMatchmakerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GKMatchmakerViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithInvite:")
    public native GKMatchmakerViewController initWithInvite(GKInvite invite);

    @Generated
    @Selector("initWithMatchRequest:")
    public native GKMatchmakerViewController initWithMatchRequest(GKMatchRequest request);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native GKMatchmakerViewController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GKMatchmakerViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native GKMatchmakerViewController initWithRootViewController(UIViewController rootViewController);

    @Generated
    @Selector("isHosted")
    public native boolean isHosted();

    @Generated
    @Selector("setHosted:")
    public native void setHosted(boolean value);

    @Generated
    @Selector("matchRequest")
    public native GKMatchRequest matchRequest();

    @Generated
    @Selector("matchmakerDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKMatchmakerViewControllerDelegate matchmakerDelegate();

    @Generated
    @Deprecated
    @Selector("setDefaultInvitationMessage:")
    public native void setDefaultInvitationMessage(String value);

    @Generated
    @Deprecated
    @Selector("setHostedPlayer:connected:")
    public native void setHostedPlayerConnected(String playerID, boolean connected);

    @Generated
    @Selector("setHostedPlayer:didConnect:")
    public native void setHostedPlayerDidConnect(GKPlayer player, boolean connected);

    @Generated
    @Deprecated
    @Selector("setHostedPlayerReady:")
    public native void setHostedPlayerReady(String playerID);

    @Generated
    @Selector("setMatchmakerDelegate:")
    public native void setMatchmakerDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) GKMatchmakerViewControllerDelegate value);

    @Generated
    public void setMatchmakerDelegate(@Mapped(ObjCObjectMapper.class) GKMatchmakerViewControllerDelegate value) {
        Object __old = matchmakerDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setMatchmakerDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
