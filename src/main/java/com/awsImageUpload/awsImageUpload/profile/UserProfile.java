package com.awsImageUpload.awsImageUpload.profile;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

public class UserProfile {

    private UUID userProfileID;
    private  String Username;
    private String userProfileImageLink; //s3Key

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileID, that.userProfileID) &&
                Objects.equals(Username, that.Username) &&
                Objects.equals(userProfileImageLink, that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileID, Username, userProfileImageLink);
    }
}