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

package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CMTimeFlags {
    @Generated public static final int Valid = 0x00000001;
    @Generated public static final int HasBeenRounded = 0x00000002;
    @Generated public static final int PositiveInfinity = 0x00000004;
    @Generated public static final int NegativeInfinity = 0x00000008;
    @Generated public static final int Indefinite = 0x00000010;
    @Generated public static final int ImpliedValueFlagsMask = 0x0000001C;

    @Generated
    private CMTimeFlags() {
    }
}
