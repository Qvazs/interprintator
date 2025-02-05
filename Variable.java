import java.util.ArrayList;
import java.util.HashMap;

public class Variable {
	
    private HashMap<String, String> vars = new HashMap<>();

	
	public void createVar(Token[] line) {
		if(line[0].getType().equals("VAR")) {
			if(line[1].getType().equals("ASSIGN")) {
				Assign ass = new Assign();
				vars.put(line[0].getText(),ass.Assign(line));

			}
		}
	}
	public HashMap getVars() {
		return vars;
	}

}


