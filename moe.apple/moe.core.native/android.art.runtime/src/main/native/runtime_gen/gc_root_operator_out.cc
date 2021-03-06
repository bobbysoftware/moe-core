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


#include <iostream>

#include "gc_root.h"

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const RootType& rhs) {
  switch (rhs) {
    case kRootUnknown: os << "RootUnknown"; break;
    case kRootJNIGlobal: os << "RootJNIGlobal"; break;
    case kRootJNILocal: os << "RootJNILocal"; break;
    case kRootJavaFrame: os << "RootJavaFrame"; break;
    case kRootNativeStack: os << "RootNativeStack"; break;
    case kRootStickyClass: os << "RootStickyClass"; break;
    case kRootThreadBlock: os << "RootThreadBlock"; break;
    case kRootMonitorUsed: os << "RootMonitorUsed"; break;
    case kRootThreadObject: os << "RootThreadObject"; break;
    case kRootInternedString: os << "RootInternedString"; break;
    case kRootFinalizing: os << "RootFinalizing"; break;
    case kRootDebugger: os << "RootDebugger"; break;
    case kRootReferenceCleanup: os << "RootReferenceCleanup"; break;
    case kRootVMInternal: os << "RootVMInternal"; break;
    case kRootJNIMonitor: os << "RootJNIMonitor"; break;
    default: os << "RootType[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

