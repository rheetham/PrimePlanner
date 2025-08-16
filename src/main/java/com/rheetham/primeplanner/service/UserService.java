package com.rheetham.primeplanner.service;

import com.rheetham.primeplanner.request.PasswordUpdateRequest;
import com.rheetham.primeplanner.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo();
    void deleteUser();
    void updatePassword(PasswordUpdateRequest passwordUpdateRequest);
}
