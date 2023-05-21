package com.keyon.design.observer3;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Account {

    private Long id;
    private String name;
    private String email;
    private String password;


}
