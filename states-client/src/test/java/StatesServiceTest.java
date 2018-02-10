import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


import java.util.List;
import org.junit.Test;

public class StatesServiceTest {

    @Test
    public void shouldGetAllStates() {
        StatesService service = new StatesService();

        List states = service.getAllStates();
        assertThat(states.size(), is(55));
    }
}