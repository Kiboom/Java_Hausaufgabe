package chapter6;

class Exercise6_22 {
	
	public static boolean isNumber(String s){
		if(s==null || s.isEmpty())
			return false;
		for(int i=0 ; i<s.length() ; i++){
			if(i==0 && s.charAt(i)=='-') continue;
			if(s.charAt(i)<'1'|| s.charAt(i)>'9') return false; 
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}