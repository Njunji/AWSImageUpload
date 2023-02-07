package com.awsImageUpload.awsImageUpload.bucket;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

public enum BucketName {

    PROFILE_IMAGE("njunjimuchai-imageupload-123");

    private final String bucketName;
}
