package com.ums.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final String SECRET_KEY = "ahuzsp";

    public static String generateToken(Map<String, Object> claims) {
        return JWT.create()
                .withClaim("claims", claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                .sign(Algorithm.HMAC256(SECRET_KEY));
    }

    public static Map<String, Object> parseToken(String token) {
        return JWT.require(Algorithm.HMAC256(SECRET_KEY))
                .build()
                .verify(token)
                .getClaim("claims")
                .asMap();
    }

    // 测试
    public static void main(String[] args) {
        String token = generateToken(Map.of("username", "admin", "id", 1));
        System.out.println("Token: " + token);
        Map<String, Object> claims = parseToken(token);
        System.out.println("Username: " + claims.get("username"));
        System.out.println("Role: " + claims.get("id"));
    }
}
