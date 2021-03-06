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

package apple.contacts;

import apple.NSObject;
import apple.contacts.protocol.CNKeyDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDateComponents;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContact extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContact(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContact alloc();

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
    @Selector("comparatorForNameSortOrder:")
    @ObjCBlock(name = "call_comparatorForNameSortOrder_ret")
    public static native Block_comparatorForNameSortOrder_ret comparatorForNameSortOrder(@NInt long sortOrder);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptorForAllComparatorKeys")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForAllComparatorKeys();

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
    @Selector("localizedStringForKey:")
    public static native String localizedStringForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("predicateForContactsInContainerWithIdentifier:")
    public static native NSPredicate predicateForContactsInContainerWithIdentifier(String containerIdentifier);

    @Generated
    @Selector("predicateForContactsInGroupWithIdentifier:")
    public static native NSPredicate predicateForContactsInGroupWithIdentifier(String groupIdentifier);

    @Generated
    @Selector("predicateForContactsMatchingName:")
    public static native NSPredicate predicateForContactsMatchingName(String name);

    @Generated
    @Selector("predicateForContactsWithIdentifiers:")
    public static native NSPredicate predicateForContactsWithIdentifiers(NSArray<String> identifiers);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("areKeysAvailable:")
    public native boolean areKeysAvailable(NSArray<?> keyDescriptors);

    @Generated
    @Selector("birthday")
    public native NSDateComponents birthday();

    @Generated
    @Selector("contactRelations")
    public native NSArray<? extends CNLabeledValue<CNContactRelation>> contactRelations();

    @Generated
    @Selector("contactType")
    @NInt
    public native long contactType();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("dates")
    public native NSArray<? extends CNLabeledValue<NSDateComponents>> dates();

    @Generated
    @Selector("departmentName")
    public native String departmentName();

    @Generated
    @Selector("emailAddresses")
    public native NSArray<? extends CNLabeledValue<String>> emailAddresses();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("familyName")
    public native String familyName();

    @Generated
    @Selector("givenName")
    public native String givenName();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("imageData")
    public native NSData imageData();

    @Generated
    @Selector("imageDataAvailable")
    public native boolean imageDataAvailable();

    @Generated
    @Selector("init")
    public native CNContact init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContact initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> instantMessageAddresses();

    @Generated
    @Selector("isKeyAvailable:")
    public native boolean isKeyAvailable(String key);

    @Generated
    @Selector("isUnifiedWithContactWithIdentifier:")
    public native boolean isUnifiedWithContactWithIdentifier(String contactIdentifier);

    @Generated
    @Selector("jobTitle")
    public native String jobTitle();

    @Generated
    @Selector("middleName")
    public native String middleName();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("namePrefix")
    public native String namePrefix();

    @Generated
    @Selector("nameSuffix")
    public native String nameSuffix();

    @Generated
    @Selector("nickname")
    public native String nickname();

    @Generated
    @Selector("nonGregorianBirthday")
    public native NSDateComponents nonGregorianBirthday();

    @Generated
    @Selector("note")
    public native String note();

    @Generated
    @Selector("organizationName")
    public native String organizationName();

    @Generated
    @Selector("phoneNumbers")
    public native NSArray<? extends CNLabeledValue<CNPhoneNumber>> phoneNumbers();

    @Generated
    @Selector("phoneticFamilyName")
    public native String phoneticFamilyName();

    @Generated
    @Selector("phoneticGivenName")
    public native String phoneticGivenName();

    @Generated
    @Selector("phoneticMiddleName")
    public native String phoneticMiddleName();

    @Generated
    @Selector("phoneticOrganizationName")
    public native String phoneticOrganizationName();

    @Generated
    @Selector("postalAddresses")
    public native NSArray<? extends CNLabeledValue<CNPostalAddress>> postalAddresses();

    @Generated
    @Selector("previousFamilyName")
    public native String previousFamilyName();

    @Generated
    @Selector("socialProfiles")
    public native NSArray<? extends CNLabeledValue<CNSocialProfile>> socialProfiles();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("thumbnailImageData")
    public native NSData thumbnailImageData();

    @Generated
    @Selector("urlAddresses")
    public native NSArray<? extends CNLabeledValue<String>> urlAddresses();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_comparatorForNameSortOrder_ret {
        @Generated
        @NInt
        long call_comparatorForNameSortOrder_ret(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }
}
