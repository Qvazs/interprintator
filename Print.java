import java.util.HashMap;

public class Print {
	public void print(Token[] line,HashMap<String,String>vars) {
		if(line[1].getType().equals("NUM")) {
			System.out.println(line[1].getText());
		}else if(line[1].getType().equals("VAR")) {
			System.out.println(vars.get(line[1].getText()));
		}
	}
}
