package me.weekbelt.myrestfulservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonFilter("UserInfo")
public class User {

    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상이어야 합니다.")
    private String name;

    @Past
    private Date joinDate;

    private String password;
    private String ssn;
}
