package com.meta.springprepare.memo;
import lombok.*;

import java.util.Date;

@Getter
@Setter
// @NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private final String contents;
    private String title;
    private Date createAt;
    private Date updateAt;

    public void  writeMemo(){

    }
}
