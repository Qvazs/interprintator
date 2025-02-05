import java.util.ArrayList;

public class Parser {

    public ArrayList<Token[]> toLines(ArrayList<Token> code) {
        ArrayList<Token[]> lines = new ArrayList<>();
        ArrayList<Token> thisLine = new ArrayList<>();
        
	        for (Token token : code) {
	            if (!token.getType().equals("SEMICOLON")) {
	                thisLine.add(token);
	            } else {
	                thisLine.add(token);
	                lines.add(thisLine.toArray(new Token[0]));
	                thisLine.clear();
	            }
	        }
	        return lines;
	    }
    
    public void parseCode(ArrayList<Token[]> lines) {
		Variable var = new Variable();
    	for(int i = 0;i<lines.size();i++) {
    		Token[] firstToken = lines.get(i);
    		if(firstToken[0].getType().equals("PRINT")) {
    			Print print = new Print();
    			print.print(firstToken,var.getVars());
    		}else if(firstToken[0].getType().equals("VAR")) {
    			var.createVar(firstToken);
    		}
    	}
    	
    }
	
	public void toString(ArrayList<Token[]>lines) {
		Token[] thisLine;
		for(int i =0;i<lines.size();i++) {
			thisLine = lines.get(i);
			System.out.println("Line "+i);
			for(int a = 0;a<thisLine.length;a++) {
				System.out.println("Position: "+thisLine[a].getPos());
				System.out.println("Type: "+thisLine[a].getType());
				System.out.println("Text: "+thisLine[a].getText());
				System.out.println();
				
			}
		}
	}
}
