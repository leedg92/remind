package remind;
/**
 * 
 * 음식점에서 음식 주문하는 프로세스 구현
 * 
 * 1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
 * 		ㄴ 손님, 메뉴판(o), 돈까스/냉면/만두(ㅇ), 요리사(o), 요리(ㅇ)
 * 2. 객체들 간의 관계를 고민
 * 		ㄴ 손님 -- 메뉴판
 * 		ㄴ 손님 -- 요리사
 * 		ㄴ 요리사 -- 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 * 		ㄴ 손님 -- 손님 타입
 * 		ㄴ 돈까스/냉면/만두 -- 메뉴 타입
 * 		ㄴ 메뉴판 -- 메뉴판 타입
 * 		
 * 4. 협력을 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현하
 * 
 *
 */

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	@DisplayName("메뉴 이름에 해당하는 요리를 주문한다.")
	@Test
	void orderTest() {
		Customer customer = new Customer();
		Menu menu = new Menu(List.of(new MenuItem("돈까스",5000), new MenuItem("냉면",3000), new MenuItem("만두",4000)));
		Cooking cooking = new Cooking();
		
		
		assertThatCode(() ->customer.order("만두", menu, cooking))
						.doesNotThrowAnyException();
	}
	
	@DisplayName("메뉴에 해당하는 금액을 지불한다.")
	@Test
	void payTest() {
		Customer customer = new Customer();
		Menu menu = new Menu(List.of(new MenuItem("돈까스",5000), new MenuItem("냉면",3000), new MenuItem("만두",4000)));
		Cooking cooking = new Cooking();
		
		assertThatCode(() -> customer.pay("돈까스",3000, menu, cooking))
						.doesNotThrowAnyException();
	}

}
