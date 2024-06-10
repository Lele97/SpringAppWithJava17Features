package local.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

    private int courseId;
    private String title;
    private String description;
    private String link;
}
