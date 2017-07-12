package epam.shatau.task.string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestString {
	
	public static void main(String[] args){
		//20. ���������� ���������� ������������ � ������ ������ ������ ����������.
		
		String sampleText = "����� �������� ���� ����. ������ ���� - ����� � �������� � ���� � �����." + "\r" 
				+ "���������, � ����� ��������� �����, ���� ��� �������� � �����, ����� �������, �����������" + "\r" 
				+ "����� - ����� ����� �� ������. ����, ����������... � ���! � ��� ���� �����!" + "\r" 
				+ "��������, ������ � ������. ��������� ������ ���� - 12 ��, ������ ���� �� ������." + "\r" 
				+ "�� ������ �� ������. � ��� � ����� ��...";
		
		
		System.out.println(sampleText);
		
		Matcher matcher = Pattern.compile("\\p{Punct}").matcher(sampleText);
		
		int resultCount = 0;
		
		while (matcher.find()) {
			resultCount++;
		}
		
		System.out.println("Quantitu of punctuation symbols is: " + resultCount);
		
	}

}


