package trainings.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RemindMe {

    String reason();
    String when();
}
