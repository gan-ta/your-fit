package com.hs.lunpair.domain.user.dto.common;

import com.hs.lunpair.domain.user.entity.User;
import com.hs.lunpair.domain.user.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class UserDetailsDto {
    private String email;
    private String password;
    private UserRole role;

    public static UserDetailsDto toDto(User user){
        return UserDetailsDto.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getUserRole())
                .build();
    }
}
