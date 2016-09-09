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

package ios.coredata.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFetchedResultsSectionInfo")
public interface NSFetchedResultsSectionInfo {
	/**
	 * indexTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsSectionInfo_Protocol/index.html#//apple_ref/occ/intfp/NSFetchedResultsSectionInfo/indexTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexTitle")
	String indexTitle();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsSectionInfo_Protocol/index.html#//apple_ref/occ/intfp/NSFetchedResultsSectionInfo/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	String name();

	/**
	 * numberOfObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsSectionInfo_Protocol/index.html#//apple_ref/occ/intfp/NSFetchedResultsSectionInfo/numberOfObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfObjects")
	@NUInt
	long numberOfObjects();

	/**
	 * objects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsSectionInfo_Protocol/index.html#//apple_ref/occ/intfp/NSFetchedResultsSectionInfo/objects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objects")
	NSArray<?> objects();
}