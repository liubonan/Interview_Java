package solution;

public class Solution {
	private enum State{
		START,
		STARTDOT,
		SIGN,
		DIGIT,
		DOT,
		DOTDIGIT,
		EXP,
		EXPSIGN,
		EXPDIGIT,
		INVALID
	}
	
	public boolean isNumber(String s) {

		int i = 0, j = s.length() - 1;
		
		while(i <= j && Character.isWhitespace(s.charAt(i))){
			i ++;
		}
		
		while(j >= i && Character.isWhitespace(s.charAt(j))){
			j --;
		}
		
		State current = State.START;
		while(i <= j){
			char c = s.charAt(i);
			switch(current){
			case START:
				if(c == '-' || c == '+'){
					current = State.SIGN;
				}
				else if(Character.isDigit(c)){
					current = State.DIGIT;
				}
				else if(c == '.'){
					current = State.STARTDOT;
				}
				else{
					current = State.INVALID;
				}
				break;
			case SIGN:
				if(Character.isDigit(c)){
					current = State.DIGIT;
				}
				else if(c == '.'){
					current = State.STARTDOT;
				}
				else{
					current = State.INVALID;
				}
				break;
			case DIGIT:
				if(c == '.'){
					current = State.DOT;
				}
				else if(c == 'e' || c == 'E'){
					current = State.EXP;
				}
				else if(!Character.isDigit(c)){
					current = State.INVALID;
				}
				break;
			case DOT: 
				if(Character.isDigit(c)){
					current = State.DOTDIGIT;
				}
				else if(c == 'e' || c == 'E'){
					current = State.EXP;
				}
				else{
					current = State.INVALID;
				}
				break;
			case STARTDOT:
				if(Character.isDigit(c)){
					current = State.DOTDIGIT;
				}
				else{
					current = State.INVALID;
				}
				break;
			case DOTDIGIT:
				if(c == 'e' || c == 'E'){
					current = State.EXP;
				}
				else if(!Character.isDigit(c)){
					current = State.INVALID;
				}
				break;
			case EXP:
				if(c == '-' || c == '+'){
					current = State.EXPSIGN;
				}
				else if(Character.isDigit(c)){
					current = State.EXPDIGIT;
				}
				else{
					current = State.INVALID;
				}
				break;
			case EXPSIGN:
				if(Character.isDigit(c)){
					current = State.EXPDIGIT;
				}
				else{
					current = State.INVALID;
				}
				break;
			case EXPDIGIT:
				if(!Character.isDigit(c)){
					current = State.INVALID;
				}
				break;
			default: 
					return false;
			}
			
			i++;
		}
		
		return current == State.DIGIT ||
				current == State.DOTDIGIT ||
				current == State.EXPDIGIT ||
				current == State.DOT? 
						true : false;
	}
}
