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

package ios.coremedia.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
	@Generated
	private Enums() {
	}

	@Generated
	public static final int kCMBufferQueueError_AllocationFailed = 0xFFFFCE28;
	@Generated
	public static final int kCMBufferQueueError_RequiredParameterMissing = 0xFFFFCE27;
	@Generated
	public static final int kCMBufferQueueError_InvalidCMBufferCallbacksStruct = 0xFFFFCE26;
	@Generated
	public static final int kCMBufferQueueError_EnqueueAfterEndOfData = 0xFFFFCE25;
	@Generated
	public static final int kCMBufferQueueError_QueueIsFull = 0xFFFFCE24;
	@Generated
	public static final int kCMBufferQueueError_BadTriggerDuration = 0xFFFFCE23;
	@Generated
	public static final int kCMBufferQueueError_CannotModifyQueueFromTriggerCallback = 0xFFFFCE22;
	@Generated
	public static final int kCMBufferQueueError_InvalidTriggerCondition = 0xFFFFCE21;
	@Generated
	public static final int kCMBufferQueueError_InvalidTriggerToken = 0xFFFFCE20;
	@Generated
	public static final int kCMBufferQueueError_InvalidBuffer = 0xFFFFCE1F;
	@Generated
	public static final int kCMBlockBufferCustomBlockSourceVersion = 0x00000000;
	@Generated
	public static final int kCMMetadataDataTypeRegistryError_AllocationFailed = 0xFFFFC04A;
	@Generated
	public static final int kCMMetadataDataTypeRegistryError_RequiredParameterMissing = 0xFFFFC049;
	@Generated
	public static final int kCMMetadataDataTypeRegistryError_BadDataTypeIdentifier = 0xFFFFC048;
	@Generated
	public static final int kCMMetadataDataTypeRegistryError_DataTypeAlreadyRegistered = 0xFFFFC047;
	@Generated
	public static final int kCMMetadataDataTypeRegistryError_RequiresConformingBaseType = 0xFFFFC046;
	@Generated
	public static final int kCMMetadataDataTypeRegistryError_MultipleConformingBaseTypes = 0xFFFFC045;
	@Generated
	public static final int kCMPersistentTrackID_Invalid = 0x00000000;
	@Generated
	public static final int kCMTimebaseError_MissingRequiredParameter = 0xFFFFCE34;
	@Generated
	public static final int kCMTimebaseError_InvalidParameter = 0xFFFFCE33;
	@Generated
	public static final int kCMTimebaseError_AllocationFailed = 0xFFFFCE32;
	@Generated
	public static final int kCMTimebaseError_TimerIntervalTooShort = 0xFFFFCE31;
	@Generated
	public static final int kCMTimebaseError_ReadOnly = 0xFFFFCE2B;
	@Generated
	public static final int kCMSyncError_MissingRequiredParameter = 0xFFFFCE30;
	@Generated
	public static final int kCMSyncError_InvalidParameter = 0xFFFFCE2F;
	@Generated
	public static final int kCMSyncError_AllocationFailed = 0xFFFFCE2E;
	@Generated
	public static final int kCMSyncError_RateMustBeNonZero = 0xFFFFCE2D;
	@Generated
	public static final int kCMSimpleQueueError_AllocationFailed = 0xFFFFCE1E;
	@Generated
	public static final int kCMSimpleQueueError_RequiredParameterMissing = 0xFFFFCE1D;
	@Generated
	public static final int kCMSimpleQueueError_ParameterOutOfRange = 0xFFFFCE1C;
	@Generated
	public static final int kCMSimpleQueueError_QueueIsFull = 0xFFFFCE1B;
	@Generated
	public static final int kCMAudioFormatDescriptionMask_StreamBasicDescription = 0x00000001;
	@Generated
	public static final int kCMAudioFormatDescriptionMask_MagicCookie = 0x00000002;
	@Generated
	public static final int kCMAudioFormatDescriptionMask_ChannelLayout = 0x00000004;
	@Generated
	public static final int kCMAudioFormatDescriptionMask_Extensions = 0x00000008;
	@Generated
	public static final int kCMAudioFormatDescriptionMask_All = 0x0000000F;
	@Generated
	public static final int kCMSampleBufferError_AllocationFailed = 0xFFFFCE46;
	@Generated
	public static final int kCMSampleBufferError_RequiredParameterMissing = 0xFFFFCE45;
	@Generated
	public static final int kCMSampleBufferError_AlreadyHasDataBuffer = 0xFFFFCE44;
	@Generated
	public static final int kCMSampleBufferError_BufferNotReady = 0xFFFFCE43;
	@Generated
	public static final int kCMSampleBufferError_SampleIndexOutOfRange = 0xFFFFCE42;
	@Generated
	public static final int kCMSampleBufferError_BufferHasNoSampleSizes = 0xFFFFCE41;
	@Generated
	public static final int kCMSampleBufferError_BufferHasNoSampleTimingInfo = 0xFFFFCE40;
	@Generated
	public static final int kCMSampleBufferError_ArrayTooSmall = 0xFFFFCE3F;
	@Generated
	public static final int kCMSampleBufferError_InvalidEntryCount = 0xFFFFCE3E;
	@Generated
	public static final int kCMSampleBufferError_CannotSubdivide = 0xFFFFCE3D;
	@Generated
	public static final int kCMSampleBufferError_SampleTimingInfoInvalid = 0xFFFFCE3C;
	@Generated
	public static final int kCMSampleBufferError_InvalidMediaTypeForOperation = 0xFFFFCE3B;
	@Generated
	public static final int kCMSampleBufferError_InvalidSampleData = 0xFFFFCE3A;
	@Generated
	public static final int kCMSampleBufferError_InvalidMediaFormat = 0xFFFFCE39;
	@Generated
	public static final int kCMSampleBufferError_Invalidated = 0xFFFFCE38;
	@Generated
	public static final int kCMSampleBufferError_DataFailed = 0xFFFFBE92;
	@Generated
	public static final int kCMSampleBufferError_DataCanceled = 0xFFFFBE91;
	@Generated
	public static final int kCMTimeCodeFlag_DropFrame = 0x00000001;
	@Generated
	public static final int kCMTimeCodeFlag_24HourMax = 0x00000002;
	@Generated
	public static final int kCMTimeCodeFlag_NegTimesOK = 0x00000004;
	@Generated
	public static final int kCMBlockBufferAssureMemoryNowFlag = 0x00000001;
	@Generated
	public static final int kCMBlockBufferAlwaysCopyDataFlag = 0x00000002;
	@Generated
	public static final int kCMBlockBufferDontOptimizeDepthFlag = 0x00000004;
	@Generated
	public static final int kCMBlockBufferPermitEmptyReferenceFlag = 0x00000008;
	@Generated
	public static final byte kCMTextJustification_left_top = 0;
	@Generated
	public static final byte kCMTextJustification_centered = 1;
	@Generated
	public static final byte kCMTextJustification_bottom_right = -1;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenDurationBecomesLessThan = 0x00000001;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenDurationBecomesLessThanOrEqualTo = 0x00000002;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenDurationBecomesGreaterThan = 0x00000003;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenDurationBecomesGreaterThanOrEqualTo = 0x00000004;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenMinPresentationTimeStampChanges = 0x00000005;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenMaxPresentationTimeStampChanges = 0x00000006;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenDataBecomesReady = 0x00000007;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenEndOfDataReached = 0x00000008;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenReset = 0x00000009;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenBufferCountBecomesLessThan = 0x0000000A;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenBufferCountBecomesGreaterThan = 0x0000000B;
	@Generated
	public static final int kCMMetadataFormatType_ICY = 0x69637920;
	@Generated
	public static final int kCMMetadataFormatType_ID3 = 0x69643320;
	@Generated
	public static final int kCMMetadataFormatType_Boxed = 0x6D656278;
	@Generated
	public static final int kCMVideoCodecType_422YpCbCr8 = 0x32767579;
	@Generated
	public static final int kCMVideoCodecType_Animation = 0x726C6520;
	@Generated
	public static final int kCMVideoCodecType_Cinepak = 0x63766964;
	@Generated
	public static final int kCMVideoCodecType_JPEG = 0x6A706567;
	@Generated
	public static final int kCMVideoCodecType_JPEG_OpenDML = 0x646D6231;
	@Generated
	public static final int kCMVideoCodecType_SorensonVideo = 0x53565131;
	@Generated
	public static final int kCMVideoCodecType_SorensonVideo3 = 0x53565133;
	@Generated
	public static final int kCMVideoCodecType_H263 = 0x68323633;
	@Generated
	public static final int kCMVideoCodecType_H264 = 0x61766331;
	@Generated
	public static final int kCMVideoCodecType_MPEG4Video = 0x6D703476;
	@Generated
	public static final int kCMVideoCodecType_MPEG2Video = 0x6D703276;
	@Generated
	public static final int kCMVideoCodecType_MPEG1Video = 0x6D703176;
	@Generated
	public static final int kCMVideoCodecType_DVCNTSC = 0x64766320;
	@Generated
	public static final int kCMVideoCodecType_DVCPAL = 0x64766370;
	@Generated
	public static final int kCMVideoCodecType_DVCProPAL = 0x64767070;
	@Generated
	public static final int kCMVideoCodecType_DVCPro50NTSC = 0x6476356E;
	@Generated
	public static final int kCMVideoCodecType_DVCPro50PAL = 0x64763570;
	@Generated
	public static final int kCMVideoCodecType_DVCPROHD720p60 = 0x64766870;
	@Generated
	public static final int kCMVideoCodecType_DVCPROHD720p50 = 0x64766871;
	@Generated
	public static final int kCMVideoCodecType_DVCPROHD1080i60 = 0x64766836;
	@Generated
	public static final int kCMVideoCodecType_DVCPROHD1080i50 = 0x64766835;
	@Generated
	public static final int kCMVideoCodecType_DVCPROHD1080p30 = 0x64766833;
	@Generated
	public static final int kCMVideoCodecType_DVCPROHD1080p25 = 0x64766832;
	@Generated
	public static final int kCMVideoCodecType_AppleProRes4444 = 0x61703468;
	@Generated
	public static final int kCMVideoCodecType_AppleProRes422HQ = 0x61706368;
	@Generated
	public static final int kCMVideoCodecType_AppleProRes422 = 0x6170636E;
	@Generated
	public static final int kCMVideoCodecType_AppleProRes422LT = 0x61706373;
	@Generated
	public static final int kCMVideoCodecType_AppleProRes422Proxy = 0x6170636F;
	@Generated
	public static final int kCMTextDisplayFlag_scrollIn = 0x00000020;
	@Generated
	public static final int kCMTextDisplayFlag_scrollOut = 0x00000040;
	@Generated
	public static final int kCMTextDisplayFlag_scrollDirectionMask = 0x00000180;
	@Generated
	public static final int kCMTextDisplayFlag_scrollDirection_bottomToTop = 0x00000000;
	@Generated
	public static final int kCMTextDisplayFlag_scrollDirection_rightToLeft = 0x00000080;
	@Generated
	public static final int kCMTextDisplayFlag_scrollDirection_topToBottom = 0x00000100;
	@Generated
	public static final int kCMTextDisplayFlag_scrollDirection_leftToRight = 0x00000180;
	@Generated
	public static final int kCMTextDisplayFlag_continuousKaraoke = 0x00000800;
	@Generated
	public static final int kCMTextDisplayFlag_writeTextVertically = 0x00020000;
	@Generated
	public static final int kCMTextDisplayFlag_fillTextRegion = 0x00040000;
	@Generated
	public static final int kCMTextDisplayFlag_obeySubtitleFormatting = 0x20000000;
	@Generated
	public static final int kCMTextDisplayFlag_forcedSubtitlesPresent = 0x40000000;
	@Generated
	public static final int kCMTextDisplayFlag_allSubtitlesForced = 0x80000000;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_InvalidParameter = 0xFFFFCE58;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_AllocationFailed = 0xFFFFCE57;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_InvalidSerializedSampleDescription = 0xFFFFCE56;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_InvalidFormatDescription = 0xFFFFCE55;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_IncompatibleFormatDescription = 0xFFFFCE54;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_UnsupportedSampleDescriptionFlavor = 0xFFFFCE53;
	@Generated
	public static final int kCMFormatDescriptionBridgeError_InvalidSlice = 0xFFFFCE51;
	@Generated
	public static final int kCMSampleBufferFlag_AudioBufferList_Assure16ByteAlignment = 0x00000001;
	@Generated
	public static final int kCMBlockBufferNoErr = 0x00000000;
	@Generated
	public static final int kCMBlockBufferStructureAllocationFailedErr = 0xFFFFCE64;
	@Generated
	public static final int kCMBlockBufferBlockAllocationFailedErr = 0xFFFFCE63;
	@Generated
	public static final int kCMBlockBufferBadCustomBlockSourceErr = 0xFFFFCE62;
	@Generated
	public static final int kCMBlockBufferBadOffsetParameterErr = 0xFFFFCE61;
	@Generated
	public static final int kCMBlockBufferBadLengthParameterErr = 0xFFFFCE60;
	@Generated
	public static final int kCMBlockBufferBadPointerParameterErr = 0xFFFFCE5F;
	@Generated
	public static final int kCMBlockBufferEmptyBBufErr = 0xFFFFCE5E;
	@Generated
	public static final int kCMBlockBufferUnallocatedBlockErr = 0xFFFFCE5D;
	@Generated
	public static final int kCMBlockBufferInsufficientSpaceErr = 0xFFFFCE5C;
	@Generated
	public static final int kCMClosedCaptionFormatType_CEA608 = 0x63363038;
	@Generated
	public static final int kCMClosedCaptionFormatType_CEA708 = 0x63373038;
	@Generated
	public static final int kCMClosedCaptionFormatType_ATSC = 0x61746363;
	@Generated
	public static final int kCMMuxedStreamType_MPEG1System = 0x6D703173;
	@Generated
	public static final int kCMMuxedStreamType_MPEG2Transport = 0x6D703274;
	@Generated
	public static final int kCMMuxedStreamType_MPEG2Program = 0x6D703270;
	@Generated
	public static final int kCMMuxedStreamType_DV = 0x64762020;
	@Generated
	public static final int kCMTextFormatType_QTText = 0x74657874;
	@Generated
	public static final int kCMTextFormatType_3GText = 0x74783367;
	@Generated
	public static final int kCMTimeCodeFormatType_TimeCode32 = 0x746D6364;
	@Generated
	public static final int kCMTimeCodeFormatType_TimeCode64 = 0x74633634;
	@Generated
	public static final int kCMTimeCodeFormatType_Counter32 = 0x636E3332;
	@Generated
	public static final int kCMTimeCodeFormatType_Counter64 = 0x636E3634;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_720p30 = 0x68647631;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_1080i60 = 0x68647632;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_1080i50 = 0x68647633;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_720p24 = 0x68647634;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_720p25 = 0x68647635;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_1080p24 = 0x68647636;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_1080p25 = 0x68647637;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_1080p30 = 0x68647638;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_720p60 = 0x68647639;
	@Generated
	public static final int kCMMPEG2VideoProfile_HDV_720p50 = 0x68647661;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD_1080i60_VBR35 = 0x78647632;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD_1080i50_VBR35 = 0x78647633;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD_1080p24_VBR35 = 0x78647636;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD_1080p25_VBR35 = 0x78647637;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD_1080p30_VBR35 = 0x78647638;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_720p24_VBR35 = 0x78647634;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_720p25_VBR35 = 0x78647635;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_720p30_VBR35 = 0x78647631;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_720p50_VBR35 = 0x78647661;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_720p60_VBR35 = 0x78647639;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_1080i60_VBR35 = 0x78647662;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_1080i50_VBR35 = 0x78647663;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_1080p24_VBR35 = 0x78647664;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_1080p25_VBR35 = 0x78647665;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_EX_1080p30_VBR35 = 0x78647666;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_720p50_CBR50 = 0x78643561;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_720p60_CBR50 = 0x78643539;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_1080i60_CBR50 = 0x78643562;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_1080i50_CBR50 = 0x78643563;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_1080p24_CBR50 = 0x78643564;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_1080p25_CBR50 = 0x78643565;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_1080p30_CBR50 = 0x78643566;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD_540p = 0x78646864;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_540p = 0x78646832;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_720p24_CBR50 = 0x78643534;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_720p25_CBR50 = 0x78643535;
	@Generated
	public static final int kCMMPEG2VideoProfile_XDCAM_HD422_720p30_CBR50 = 0x78643531;
	@Generated
	public static final int kCMMPEG2VideoProfile_XF = 0x78667A31;
	@Generated
	public static final int kCMAttachmentMode_ShouldNotPropagate = 0x00000000;
	@Generated
	public static final int kCMAttachmentMode_ShouldPropagate = 0x00000001;
	@Generated
	public static final int kCMFormatDescriptionError_InvalidParameter = 0xFFFFCE5A;
	@Generated
	public static final int kCMFormatDescriptionError_AllocationFailed = 0xFFFFCE59;
	@Generated
	public static final int kCMFormatDescriptionError_ValueNotAvailable = 0xFFFFCE52;
	@Generated
	public static final int kCMClockError_MissingRequiredParameter = 0xFFFFCE37;
	@Generated
	public static final int kCMClockError_InvalidParameter = 0xFFFFCE36;
	@Generated
	public static final int kCMClockError_AllocationFailed = 0xFFFFCE35;
	@Generated
	public static final int kCMClockError_UnsupportedOperation = 0xFFFFCE2C;
	@Generated
	public static final int kCMMetadataIdentifierError_AllocationFailed = 0xFFFFC054;
	@Generated
	public static final int kCMMetadataIdentifierError_RequiredParameterMissing = 0xFFFFC053;
	@Generated
	public static final int kCMMetadataIdentifierError_BadKey = 0xFFFFC052;
	@Generated
	public static final int kCMMetadataIdentifierError_BadKeyLength = 0xFFFFC051;
	@Generated
	public static final int kCMMetadataIdentifierError_BadKeyType = 0xFFFFC050;
	@Generated
	public static final int kCMMetadataIdentifierError_BadNumberKey = 0xFFFFC04F;
	@Generated
	public static final int kCMMetadataIdentifierError_BadKeySpace = 0xFFFFC04E;
	@Generated
	public static final int kCMMetadataIdentifierError_BadIdentifier = 0xFFFFC04D;
	@Generated
	public static final int kCMMetadataIdentifierError_NoKeyValueAvailable = 0xFFFFC04C;
	@Generated
	public static final int kCMPixelFormat_32ARGB = 0x00000020;
	@Generated
	public static final int kCMPixelFormat_32BGRA = 0x42475241;
	@Generated
	public static final int kCMPixelFormat_24RGB = 0x00000018;
	@Generated
	public static final int kCMPixelFormat_16BE555 = 0x00000010;
	@Generated
	public static final int kCMPixelFormat_16BE565 = 0x42353635;
	@Generated
	public static final int kCMPixelFormat_16LE555 = 0x4C353535;
	@Generated
	public static final int kCMPixelFormat_16LE565 = 0x4C353635;
	@Generated
	public static final int kCMPixelFormat_16LE5551 = 0x35353531;
	@Generated
	public static final int kCMPixelFormat_422YpCbCr8 = 0x32767579;
	@Generated
	public static final int kCMPixelFormat_422YpCbCr8_yuvs = 0x79757673;
	@Generated
	public static final int kCMPixelFormat_444YpCbCr8 = 0x76333038;
	@Generated
	public static final int kCMPixelFormat_4444YpCbCrA8 = 0x76343038;
	@Generated
	public static final int kCMPixelFormat_422YpCbCr16 = 0x76323136;
	@Generated
	public static final int kCMPixelFormat_422YpCbCr10 = 0x76323130;
	@Generated
	public static final int kCMPixelFormat_444YpCbCr10 = 0x76343130;
	@Generated
	public static final int kCMPixelFormat_8IndexedGray_WhiteIsZero = 0x00000028;
	@Generated
	public static final int kCMAudioCodecType_AAC_LCProtected = 0x70616163;
	@Generated
	public static final int kCMAudioCodecType_AAC_AudibleProtected = 0x61616163;
	@Generated
	public static final int kCMMediaType_Video = 0x76696465;
	@Generated
	public static final int kCMMediaType_Audio = 0x736F756E;
	@Generated
	public static final int kCMMediaType_Muxed = 0x6D757878;
	@Generated
	public static final int kCMMediaType_Text = 0x74657874;
	@Generated
	public static final int kCMMediaType_ClosedCaption = 0x636C6370;
	@Generated
	public static final int kCMMediaType_Subtitle = 0x7362746C;
	@Generated
	public static final int kCMMediaType_TimeCode = 0x746D6364;
	@Generated
	public static final int kCMMediaType_Metadata = 0x6D657461;
	@Generated
	public static final int kCMSubtitleFormatType_3GText = 0x74783367;
	@Generated
	public static final int kCMSubtitleFormatType_WebVTT = 0x77767474;
	@Generated
	public static final int kCMVideoCodecType_HEVC = 0x68766331;
	@Generated
	public static final int kCMBufferQueueTrigger_WhenDurationBecomesGreaterThanOrEqualToAndBufferCountBecomesGreaterThan = 0x0000000C;
}
