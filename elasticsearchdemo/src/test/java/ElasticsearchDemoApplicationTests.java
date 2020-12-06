import com.es.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticsearchDemoApplicationTests {

    @Autowired
    private ElasticsearchTemplate restTemplate;

    @Test
    public void  contextLoads() {
        this.restTemplate.createIndex(User.class);
        this.restTemplate.putMapping(User.class);
    }
}
