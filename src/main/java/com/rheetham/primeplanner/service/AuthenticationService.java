package com.rheetham.primeplanner.service;

import com.rheetham.primeplanner.request.RegisterRequest;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
