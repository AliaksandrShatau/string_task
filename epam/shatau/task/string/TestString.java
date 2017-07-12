package epam.shatau.task.string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestString {
	
	public static void main(String[] args){
		//20. Подсчитать количество содержащихся в данном тексте знаков препинания.
		
		String sampleText = "Чутка коснулся мира кино. Делали трюк - падаю в кольчуге в воду с моста." + "\r" 
				+ "Репетиция, к мосту подвесили канат, чтоб его нашарить и ждать, когда вытянут, подготовили" + "\r" 
				+ "кошку - вдруг канат не нашарю. Упал, погрузился... о как! Я сам могу плыть!" + "\r" 
				+ "Вынырнул, поплыл к берегу. Кольчужка легкая была - 12 кг, сапоги тоже не мешали." + "\r" 
				+ "Да ничего не мешало. А вот в шлеме бы...";
		
		
		System.out.println(sampleText);
		
		Matcher matcher = Pattern.compile("\\p{Punct}").matcher(sampleText);
		
		int resultCount = 0;
		
		while (matcher.find()) {
			resultCount++;
		}
		
		System.out.println("Quantitu of punctuation symbols is: " + resultCount);
		
	}

}


