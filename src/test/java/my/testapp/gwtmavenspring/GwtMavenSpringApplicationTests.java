package my.testapp.gwtmavenspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import my.testapp.gwtmavenspring.services.PeopleService;
import my.testapp.gwtmavenspring.models.People;
import static org.junit.Assert.assertEquals; 
import java.util.List;

@SpringBootTest
//@AutoConfigureMockMvc
class GwtMavenSpringApplicationTests {

	@Test
	void contextLoads() {

	}

        @Test
        void TestBD(){
            PeopleService peopleService = new PeopleService();

            System.out.println("Заполнение БД...");

            People people = new People("Тукшов","Михайл","Саввич");
            peopleService.savePeople(people);

            People people1 = new People("Мухамедшин","Ростислав","Григорьевич");
            peopleService.savePeople(people1);

            People people3 = new People("Покрышкин","Александр","Иванович");
            peopleService.savePeople(people3);

            List<People> peoples = peopleService.findAllPeoples();
            assertEquals(3,peoples.size());
            listPeoples(peoples);
           
        }

        private static void listPeoples(List<People> peoples) { 

            System.out.println("Список Сотрудников:");

            for ( People people : peoples) { 
                System.out.println(people.toString()); 
            }
        }
}
