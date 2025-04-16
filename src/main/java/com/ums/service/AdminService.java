package com.ums.service;

import com.ums.dto.AdminUserRegisterDTO;
import com.ums.pojo.AdminUser;
import com.ums.pojo.Menu;

import java.util.List;

public interface AdminService {
    List<Menu> getMenu();

    List<AdminUser> adminUserList();

    AdminUser register(AdminUserRegisterDTO adminUserDTO);

    AdminUser findByName(String username);

    void deleteById(Long id);

    void deleteBatch(List<Long> ids);

    void updateLoginTime(Long id);
}
