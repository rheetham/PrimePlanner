package com.rheetham.primeplanner.service;

import com.rheetham.primeplanner.request.AuthenticationRequest;
import com.rheetham.primeplanner.request.RegisterRequest;
import com.rheetham.primeplanner.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
