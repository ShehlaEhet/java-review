package task;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
//@Builder generates an @AllArgsConstructor unless there is another @XConstructor
public class Orange {

    private int weight;
    private Color color;

}
