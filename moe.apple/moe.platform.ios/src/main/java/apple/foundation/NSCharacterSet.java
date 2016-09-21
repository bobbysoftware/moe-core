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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCharacterSet extends NSObject implements NSCopying, NSMutableCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCharacterSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("URLFragmentAllowedCharacterSet")
    public static native NSCharacterSet URLFragmentAllowedCharacterSet();

    @Generated
    @Selector("URLHostAllowedCharacterSet")
    public static native NSCharacterSet URLHostAllowedCharacterSet();

    @Generated
    @Selector("URLPasswordAllowedCharacterSet")
    public static native NSCharacterSet URLPasswordAllowedCharacterSet();

    @Generated
    @Selector("URLPathAllowedCharacterSet")
    public static native NSCharacterSet URLPathAllowedCharacterSet();

    @Generated
    @Selector("URLQueryAllowedCharacterSet")
    public static native NSCharacterSet URLQueryAllowedCharacterSet();

    @Generated
    @Selector("URLUserAllowedCharacterSet")
    public static native NSCharacterSet URLUserAllowedCharacterSet();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCharacterSet alloc();

    @Generated
    @Selector("alphanumericCharacterSet")
    public static native NSCharacterSet alphanumericCharacterSet();

    @Generated
    @Selector("capitalizedLetterCharacterSet")
    public static native NSCharacterSet capitalizedLetterCharacterSet();

    @Generated
    @Selector("characterSetWithBitmapRepresentation:")
    public static native NSCharacterSet characterSetWithBitmapRepresentation(NSData data);

    @Generated
    @Selector("characterSetWithCharactersInString:")
    public static native NSCharacterSet characterSetWithCharactersInString(String aString);

    @Generated
    @Selector("characterSetWithContentsOfFile:")
    public static native NSCharacterSet characterSetWithContentsOfFile(String fName);

    @Generated
    @Selector("characterSetWithRange:")
    public static native NSCharacterSet characterSetWithRange(@ByValue NSRange aRange);

    @Generated
    @Selector("controlCharacterSet")
    public static native NSCharacterSet controlCharacterSet();

    @Generated
    @Selector("decimalDigitCharacterSet")
    public static native NSCharacterSet decimalDigitCharacterSet();

    @Generated
    @Selector("decomposableCharacterSet")
    public static native NSCharacterSet decomposableCharacterSet();

    @Generated
    @Selector("illegalCharacterSet")
    public static native NSCharacterSet illegalCharacterSet();

    @Generated
    @Selector("letterCharacterSet")
    public static native NSCharacterSet letterCharacterSet();

    @Generated
    @Selector("lowercaseLetterCharacterSet")
    public static native NSCharacterSet lowercaseLetterCharacterSet();

    @Generated
    @Selector("newlineCharacterSet")
    public static native NSCharacterSet newlineCharacterSet();

    @Generated
    @Selector("nonBaseCharacterSet")
    public static native NSCharacterSet nonBaseCharacterSet();

    @Generated
    @Selector("punctuationCharacterSet")
    public static native NSCharacterSet punctuationCharacterSet();

    @Generated
    @Selector("symbolCharacterSet")
    public static native NSCharacterSet symbolCharacterSet();

    @Generated
    @Selector("uppercaseLetterCharacterSet")
    public static native NSCharacterSet uppercaseLetterCharacterSet();

    @Generated
    @Selector("whitespaceAndNewlineCharacterSet")
    public static native NSCharacterSet whitespaceAndNewlineCharacterSet();

    @Generated
    @Selector("whitespaceCharacterSet")
    public static native NSCharacterSet whitespaceCharacterSet();

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

    @Generated
    @Selector("bitmapRepresentation")
    public native NSData bitmapRepresentation();

    @Generated
    @Selector("characterIsMember:")
    public native boolean characterIsMember(char aCharacter);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("hasMemberInPlane:")
    public native boolean hasMemberInPlane(byte thePlane);

    @Generated
    @Selector("init")
    public native NSCharacterSet init();

    @Generated
    @Selector("initWithCoder:")
    public native NSCharacterSet initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("invertedSet")
    public native NSCharacterSet invertedSet();

    @Generated
    @Selector("isSupersetOfSet:")
    public native boolean isSupersetOfSet(NSCharacterSet theOtherSet);

    @Generated
    @Selector("longCharacterIsMember:")
    public native boolean longCharacterIsMember(int theLongChar);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);
}