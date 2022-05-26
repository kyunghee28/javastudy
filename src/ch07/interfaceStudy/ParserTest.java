package interfaceStudy;

// 인터페이스를 이용한 다형성

interface Parseable {
	// 구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParserManager {
	// 리턴타입이 Parseable 인티페이스이다.
	public static Parseable getParseable(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}

public class ParserTest {	
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParseable("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParseable("HTML");
		parser.parse("document2.html");
	}
}

/**	실행결과

document.xml- XML parsing completed.
document2.html- HTML parsing completed.

 **/

