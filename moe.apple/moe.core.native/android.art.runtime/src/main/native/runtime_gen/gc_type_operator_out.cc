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

#include "gc/collector/gc_type.h"

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
namespace gc {
namespace collector {
std::ostream& operator<<(std::ostream& os, const GcType& rhs) {
  switch (rhs) {
    case kGcTypeNone: os << "GcTypeNone"; break;
    case kGcTypeSticky: os << "GcTypeSticky"; break;
    case kGcTypePartial: os << "GcTypePartial"; break;
    case kGcTypeFull: os << "GcTypeFull"; break;
    case kGcTypeMax: os << "GcTypeMax"; break;
    default: os << "GcType[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace collector
}  // namespace gc
}  // namespace art

