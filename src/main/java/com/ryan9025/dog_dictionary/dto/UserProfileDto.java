package com.ryan9025.dog_dictionary.dto;

import com.ryan9025.dog_dictionary.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileDto {
    private boolean pageOwner;
    private User user;
    private int followCount;
    private boolean followState;
    private int imageTotal;
}