public class Token {
	String text;
	String type;
	int pos;
	public Token(String text,String type, int pos){
		this.text = text;
		this.type = type;
		this.pos = pos;
	}
	public String getText() {
		return text;
	}
	
	public String getType() {
		return type;
	}
	
	public int getPos() {
		return pos;
	}
}
