package com.rheetham.primeplanner.service;


import com.rheetham.primeplanner.response.UserResponse;

import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();
    UserResponse promoteToAdmin(long userId);
    void deleteNonAdminUser(long userId);
}
