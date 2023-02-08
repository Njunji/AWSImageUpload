package com.awsImageUpload.awsImageUpload.profile;

import com.awsImageUpload.awsImageUpload.datastore.FakeUserProfileDataStore;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserProfileDataAccessService {

    public final FakeUserProfileDataStore fakeUserProfileDataStore;

    List<UserProfile> getUserProfiles(){
        return fakeUserProfileDataStore.getUserProfiles();
    }
}
