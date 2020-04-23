package com.pojo.req;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class Girl {

    private String looks;

    public String getLooks() { return "good";
    }
}
