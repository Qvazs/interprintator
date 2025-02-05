import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String code ="a = 1052;"
				+ "print a;"
				+ "b = 94;"
				+ "print b;"
				+ "c = 103;"
				+ "print c;"
				+ "d = 657813254673218456713284567281;"
				+ "print d;";
		Lexer lexer = new Lexer();
		lexer.lexAnalyzator(code);
		Parser parser= new Parser();
		ArrayList<Token[]> lines = parser.toLines(lexer.lexAnalyzator(code));
		parser.parseCode(lines);
		

	}

}
                                                                                         