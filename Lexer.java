import java.util.ArrayList;
import java.util.Arrays;

public class Lexer {
	
    public ArrayList<Token> lexAnalyzator(String code) {
        String[] tokens = code.split("(?<=[=;])|(?=[=;])|\\s+");
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Token> tokenList = new ArrayList<>();
        
        for (String token : tokens) {
            if (!token.trim().isEmpty()) { 
                stringList.add(token.trim());
            }
        }
        for(int a = 0;a<stringList.size();a++) {
        	stringList.get(a).replace("\s+", "");
        }
        
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals("print")) {
                Token token = new Token(stringList.get(i), "PRINT", i);
                tokenList.add(token);
            }
            else if (stringList.get(i).equals(";")) {
                Token token = new Token(stringList.get(i), "SEMICOLON", i);
                tokenList.add(token);
            }
            
            else if (stringList.get(i).equals("=")) {
                Token token = new Token(stringList.get(i), "ASSIGN", i);
                tokenList.add(token);
            }
            
            else if (stringList.get(i).equals("+")) {
                Token token = new Token(stringList.get(i), "PLUS", i);
                tokenList.add(token);
            }
            
            else if (stringList.get(i).equals("-")) {
                Token token = new Token(stringList.get(i), "MINUS", i);
                tokenList.add(token);
            }
            
            else if (stringList.get(i).matches(".*\\d.*")) {
            	if (stringList.get(i).matches("\\d+")) {
            		Token token = new Token(stringList.get(i), "NUM", i);
                    tokenList.add(token);
                }else {
                	throw new Error("Рядом с цифрами нельзя ставить другие символы");
                }
            }
            
            else if(stringList.get(i).matches(".*[a-zA-Z].*")) {
            	 if (stringList.get(i).matches("[a-zA-Z]+")) {
             		Token token = new Token(stringList.get(i), "VAR", i);
                    tokenList.add(token);
            	 }else {
                 	throw new Error("Рядом с переменной нельзя ставить другие символы");
            	 }
            	 
            	 
            }
        }
        
        return tokenList;
    }
}
