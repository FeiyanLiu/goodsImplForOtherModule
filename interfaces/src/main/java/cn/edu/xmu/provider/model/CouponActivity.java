package cn.edu.xmu.provider.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CouponActivity {
    Long id;
    String name;
    LocalDateTime beginTime;
    LocalDateTime endTime;
}
