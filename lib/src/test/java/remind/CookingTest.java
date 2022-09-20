package remind;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookingTest {
	
	@DisplayName("요청받은 요리를 만든다.")
	@Test
	void makeCookTest() {
		Cooking cooking = new Cooking();
		MenuItem menuItem = new MenuItem("돈까스",5000);
		
		Cook cook = cooking.makeCook(menuItem);
		
		assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
	}

}
