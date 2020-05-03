package org.roland.cloud.example.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data()
@AllArgsConstructor
@NoArgsConstructor
public class R <T>{
    private Integer code;
    private String msg;
    private T data;
}
