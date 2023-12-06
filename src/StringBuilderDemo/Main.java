package StringBuilderDemo;

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
		System.out.println("index of sb is: "+sb.indexOf("se"));
		System.out.println("The substring from 2 to 6 is: "+sb.substring(2, 6));
		sb.replace(1, 4, "wxyz");
		System.out.println("String Builder toString:"+sb.myToString());
//		sb.setLength(8);
//		System.out.println("String Builder toString:"+sb.myToString());
		char []arr=new char[5];
		sb.getChars(3, 8, arr, 0);
		System.out.print("The char arr is:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The capacity of stringbuilder is: "+sb.capacity());
	}
}
