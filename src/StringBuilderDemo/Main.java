package StringBuilderDemo;
class MyStringBuilder{
	private int len;
	private String s;
	MyStringBuilder(String s){
		this.s=s;
		this.len=s.length();
	}
	void insert(int idx, String s) {
		int j=0;
		char []sArr=new char[this.len+s.length()];
		for(int i=0; i<this.len; i++) {
//			System.out.println(j);
			if(i==idx) {
				for(j=idx; j<idx+s.length(); j++) {
					sArr[j]=s.charAt(j-idx);
				}
			}
			sArr[j++]=this.s.charAt(i);
		}
		this.len+=s.length();
		this.s=new String(sArr);
	}
	void append(String s) {
		this.s+=s;
		this.len+=s.length();
	}
	void append(char c) {
		this.s+=c;
		this.len+=1;
	}
	void append(boolean b) {
		String bStr=b?"true":"false";
		
		this.s+=bStr;
		this.len+=b?4:5;
		
	}
	void append(int num) {
		String numStr=String.valueOf(num);
		this.s+=numStr;
		this.len+=numStr.length();
	}
	void deleteCharAt(int idx) {
//		int len=this.s.length();
		int j=0;
		char []sArr=new char[this.len-1];
		for(int i=0; i<len; i++) {
			if(i==idx) {
				continue;
			}
			else {
				sArr[j++]=s.charAt(i);
			}
		}
		this.len-=1;
		this.s=new String(sArr);
	}
	
	void delete(int start, int end){
		int i=0, j=0;
		char []sArr=new char[len-(end-start)];
		while(i<len) {
			sArr[j++]=s.charAt(i);
			if(i==start-1) {
				i=end;
			}
			else {
				i+=1;
			}
		}
		this.len-=(end-start);
		this.s=new String(sArr);
	}
	
	void replace(int start, int end, String s){
		int i=0, j=0;
		char []sArr=new char[this.len-(end-start)+s.length()];
		while(i<len) {
			sArr[j++]=this.s.charAt(i);
			if(i==start-1) {
				for(j=start; j<start+s.length();j++) {
					sArr[j]=s.charAt(j-start);
//					System.out.println(j);
				}
				i=end;
			}
			else {
				i+=1;
			}
//			System.out.println(j);
		}
		this.len=sArr.length;
		this.s=new String(sArr);
	}
	
	char charAt(int idx) {
		return s.charAt(idx);
	}
	
	void setCharAt(int idx, char newC) {
		char[]sArr=this.s.toCharArray();
		sArr[idx]=newC;
		this.s=new String(sArr);
	}
	
	void reverse() {
		char []sArr=new char[len];
		for(int i=0; i<len; i++) {
			sArr[i]=s.charAt(len-i-1);
		}
		this.s=new String(sArr);
	}
	
	int lastIndexOf(String s) {
		for(int i=this.len-s.length(); i>=0; i--) {
			if(s.equals(this.s.substring(i, i+s.length()))) {
				return i;
			}
		}
		return -1;
	}
	
	String substring(int start, int end) {
		return this.s.substring(start, end);
	}
	
	int length() {
		return this.len;
	}
	
	String myToString() {
		return this.s;
	}
}

public class Main {
	public static void main(String []args) {
		MyStringBuilder sb=new MyStringBuilder("abc");
		sb.append('d');
		sb.append(false);
//		sb.deleteCharAt(5);
		sb.delete(1, 4);
		sb.reverse();
		sb.reverse();
		sb.insert(1, "cde");
		sb.append(12);
		sb.setCharAt(9, '9');
		sb.insert(4, "se");
		System.out.println("last index of sb is: "+sb.lastIndexOf("se"));
		System.out.println("The substring from 2 to 6 is: "+sb.substring(2, 6));
		sb.replace(1, 4, "wxyz");
		System.out.println("String Builder toString:"+sb.myToString());
	}
}
