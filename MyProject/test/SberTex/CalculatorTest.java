package SberTex;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import SberTex.Calculator;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

import org.junit.runners.Parameterized;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalculatorTest {
	
	
	private String firstOper;
	private String secondOper;
	private String operand;
	private String results;	

	@Parameters
	public static Collection testData() throws IOException {
	return getTestData("C:\\Temp\\data.txt");
	}
	
	public CalculatorTest(String firstOper, String secondOper, String operand, String results) {
			this.firstOper = firstOper;
			this.secondOper = secondOper;
			this.operand = operand;
			this.results = results;
			}

			public static Collection<String[]> getTestData(String fileName)
			throws IOException {
			List<String[]> records = new ArrayList<String[]>();
			String record;
			BufferedReader file = new BufferedReader(new FileReader(fileName));
			while ((record = file.readLine()) != null) {
			String fields[] = record.split(";");
			records.add(fields);
			}
			file.close();
			return records;
			}

			 @Title("Тест калькулятора")
			 @Description("Тестовое задание по Автоматизации Тестирования (основа Java,  набираем Software Developer in Test)")		 
			 @Step("Получение результата {3} числа {0} на {1}")
			 @Test
			    public final void testCalc() {
			    	Calculator cl = new Calculator();
			    	String text;
			    	text="Testing operation "+firstOper+operand+firstOper+"="+results;
			    	//System.out.println(text);
			        assertEquals(text, Integer.parseInt(results), cl.calc(firstOper, secondOper, operand));
			    }
		 	
			
}
