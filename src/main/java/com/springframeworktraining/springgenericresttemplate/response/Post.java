package com.springframeworktraining.springgenericresttemplate.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Post {

    private Long userId;
    private Long id;
    private String title;
    private String body;

}
