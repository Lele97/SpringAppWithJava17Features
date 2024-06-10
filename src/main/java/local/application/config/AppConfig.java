package local.application.config;

import local.application.repository.CourseRepository;
import local.application.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "courserepository")
    public CourseRepository courseRepository() {
        return new CourseRepository();
    }

    @Bean(name = "courseservice")
    public CourseService getCourseService() {
        return new CourseService();
    }
}
