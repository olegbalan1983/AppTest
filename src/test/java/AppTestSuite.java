import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({NumbersTest.class,StringTest.class})
public class AppTestSuite {
}
