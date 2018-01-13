package com.avs.api.services;

import com.avs.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}