package com.example.thuchanhtuan03.service;

import com.example.thuchanhtuan03.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
