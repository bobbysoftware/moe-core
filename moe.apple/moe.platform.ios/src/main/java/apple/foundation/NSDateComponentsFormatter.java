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

package apple.foundation;

import apple.NSObject;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateComponentsFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDateComponentsFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateComponentsFormatter alloc();

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
    @Selector("localizedStringFromDateComponents:unitsStyle:")
    public static native String localizedStringFromDateComponentsUnitsStyle(NSDateComponents components,
            @NInt long unitsStyle);

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

    @Generated
    @Selector("allowedUnits")
    @NUInt
    public native long allowedUnits();

    @Generated
    @Selector("allowsFractionalUnits")
    public native boolean allowsFractionalUnits();

    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

    @Generated
    @Selector("collapsesLargestUnit")
    public native boolean collapsesLargestUnit();

    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    @Generated
    @Selector("getObjectValue:forString:errorDescription:")
    public native boolean getObjectValueForStringErrorDescription(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, String string,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    @Generated
    @Selector("includesApproximationPhrase")
    public native boolean includesApproximationPhrase();

    @Generated
    @Selector("includesTimeRemainingPhrase")
    public native boolean includesTimeRemainingPhrase();

    @Generated
    @Selector("init")
    public native NSDateComponentsFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateComponentsFormatter initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("maximumUnitCount")
    @NInt
    public native long maximumUnitCount();

    @Generated
    @Selector("setAllowedUnits:")
    public native void setAllowedUnits(@NUInt long value);

    @Generated
    @Selector("setAllowsFractionalUnits:")
    public native void setAllowsFractionalUnits(boolean value);

    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    @Generated
    @Selector("setCollapsesLargestUnit:")
    public native void setCollapsesLargestUnit(boolean value);

    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    @Generated
    @Selector("setIncludesApproximationPhrase:")
    public native void setIncludesApproximationPhrase(boolean value);

    @Generated
    @Selector("setIncludesTimeRemainingPhrase:")
    public native void setIncludesTimeRemainingPhrase(boolean value);

    @Generated
    @Selector("setMaximumUnitCount:")
    public native void setMaximumUnitCount(@NInt long value);

    @Generated
    @Selector("setUnitsStyle:")
    public native void setUnitsStyle(@NInt long value);

    @Generated
    @Selector("setZeroFormattingBehavior:")
    public native void setZeroFormattingBehavior(@NUInt long value);

    @Generated
    @Selector("stringForObjectValue:")
    public native String stringForObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @Selector("stringFromDate:toDate:")
    public native String stringFromDateToDate(NSDate startDate, NSDate endDate);

    @Generated
    @Selector("stringFromDateComponents:")
    public native String stringFromDateComponents(NSDateComponents components);

    @Generated
    @Selector("stringFromTimeInterval:")
    public native String stringFromTimeInterval(double ti);

    @Generated
    @Selector("unitsStyle")
    @NInt
    public native long unitsStyle();

    @Generated
    @Selector("zeroFormattingBehavior")
    @NUInt
    public native long zeroFormattingBehavior();
}
