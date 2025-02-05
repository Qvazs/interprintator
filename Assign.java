
public class Assign {
	public String Assign(Token[]line) {
		String val = "";
		if(line[1].getType().equals("ASSIGN")) {
			if(line[2].getType().equals("NUM")) {
				val = line[2].getText();
				if(!line[3].getType().equals("SEMICOLON")) {
					throw new Error("В конце строки должна находится ;");
				}
				
			}
			else throw new Error("После = должно находится число");
		}
		return val;
	}

}
