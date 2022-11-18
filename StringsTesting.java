
public class StringsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String MyStr = "Alex Portapila The Writer   ";
		
		System.out.println("raw[" + MyStr + "]\n");
		System.out.println("toLowerCase()=[" + MyStr.toLowerCase() + "]");
		System.out.println("toUpperCase()=[" + MyStr.toUpperCase() + "]");
		System.out.println("toLowerCase().trim()=[" + MyStr.toLowerCase().trim() + "]");
		System.out.println("substring(5)=[" + MyStr.substring(5) + "]");
		System.out.println("substring(5,14)=[" + MyStr.substring(5,14) + "]");
		System.out.println("replace('a','x')[" + MyStr.replace('a','x') + "]");
		System.out.println("replace(\"Alex\",\"Clebe\")[" + MyStr.replace("Alex","Cleber") + "]");
		System.out.println("indexOf(\"Portapila\")=[" + MyStr.indexOf("Portapila") + "]");
		System.out.println("lastIndexOf(\"Portapila\")=[" + MyStr.lastIndexOf("Portapila") + "]");
		
		String[] vector = MyStr.split(" ");
		System.out.print("split(\' \')=");
		for (String s: vector)
		{
			System.out.print("[" + s + "]");
		} 
		System.out.println("");
		
		

	}

}

