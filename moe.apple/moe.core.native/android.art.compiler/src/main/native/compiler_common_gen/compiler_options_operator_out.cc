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

#include "driver/compiler_options.h"

// This was automatically generated by /Volumes/Android/inde-dev//art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const CompilerOptions::CompilerFilter& rhs) {
  switch (rhs) {
    case CompilerOptions::kVerifyNone: os << "VerifyNone"; break;
    case CompilerOptions::kInterpretOnly: os << "InterpretOnly"; break;
    case CompilerOptions::kVerifyAtRuntime: os << "VerifyAtRuntime"; break;
    case CompilerOptions::kSpace: os << "Space"; break;
    case CompilerOptions::kBalanced: os << "Balanced"; break;
    case CompilerOptions::kSpeed: os << "Speed"; break;
    case CompilerOptions::kEverything: os << "Everything"; break;
    case CompilerOptions::kTime: os << "Time"; break;
    default: os << "CompilerOptions::CompilerFilter[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

