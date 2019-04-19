package  com.furlenco.blog.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.hibernate.annotations.Table;

//import org.jetbrains.annotations.Nullable;
import javax.persistence.Entity;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@Entity
public class ErrorModel implements Serializable {

    @JsonProperty("message")
    private String message;

    @JsonProperty("source")
    private String source;
}