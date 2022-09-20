package remind;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuTest {
	
	
	
	@DisplayName("메뉴이름에 해당하는 메뉴를 해당한다.")
	@Test
	void chooseTest() {
		Menu menu = new Menu(List.of(new MenuItem("돈까스",5000), new MenuItem("냉면",3000), new MenuItem("만두",4000)));
		
		MenuItem menuItem = menu.choose("돈까스");
		
		assertThat(menuItem).isEqualTo(new MenuItem("돈까스",5000));
	}
	
	@DisplayName("메뉴판에 없는 메뉴를 주문할 시 예외를 반환한다.")
	@Test
	void chooseWrongTest() {
		Menu menu = new Menu(List.of(new MenuItem("돈까스",5000), new MenuItem("냉면",3000), new MenuItem("만두",4000)));
		
//		MenuItem menuItem = menu.choose("떡볶이");
		
		assertThatCode(() -> menu.choose("떡볶이"))
						.isInstanceOf(IllegalArgumentException.class)
						.hasMessage("잘못된 메뉴 이름입니다.");
		
	}
}
