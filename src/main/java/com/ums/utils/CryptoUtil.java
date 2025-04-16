package com.ums.utils;
import org.mindrot.jbcrypt.BCrypt;

public class CryptoUtil {
    /**
     * 生成哈希密码
     * @param plainPassword 明文密码
     * @return 哈希后的密码（含随机盐）
     */
    public static String hashPassword(String plainPassword) {
        // BCrypt 自动生成盐并组合到哈希值中
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    /**
     * 验证密码是否匹配
     * @param plainPassword 用户输入的明文密码
     * @param hashedPassword 数据库存储的哈希密码
     * @return 是否匹配
     */
    public static boolean verifyPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

    // 测试
    public static void main(String[] args) {
        String originalPassword = "MySecurePassword123!";

        // 哈希密码（存储到数据库）
        String hashedPassword = hashPassword(originalPassword);
        System.out.println("Hashed Password: " + hashedPassword);

        // 验证密码（登录时校验）
        boolean isMatch = verifyPassword(originalPassword, hashedPassword);
        System.out.println("Password Match: " + isMatch); // true

        // 错误密码测试
        boolean isWrongMatch = verifyPassword("WrongPassword", hashedPassword);
        System.out.println("Wrong Password Match: " + isWrongMatch); // false
    }
}