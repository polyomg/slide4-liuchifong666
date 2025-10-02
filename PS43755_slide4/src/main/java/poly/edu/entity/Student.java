package poly.edu.entity;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private String id;
    private String fullname;
    private Boolean gender;

    @Builder.Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday = new Date();

    @Builder.Default
    private String photo = "photo.png";

    private Double mark;
}
