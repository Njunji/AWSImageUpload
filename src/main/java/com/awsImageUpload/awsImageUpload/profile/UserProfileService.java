package com.awsImageUpload.awsImageUpload.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserProfileService {

    @Autowired
    private UserProfileDataAccessService userProfileDataAccessService;

    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();
    }

}
