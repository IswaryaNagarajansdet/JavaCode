package Assignments;

public class assignment40 {

	public static void main(String[] args) {
		String a="Automation";
		System.out.println(a.substring(5));//substring
		System.out.println(a.contains(a));;//contains
        //check if the string starts with a
        boolean b1= a.matches("A(.*)");
        System.out.println(b1);
        
        //check if the string ends with o
        boolean b2= a.matches("(.*)n");//matches
        System.out.println(b2);
        //check if the string contains t in it
        boolean b3= a.matches("(.*)z(.*)");
        System.out.println(b3);
       System.out.println(a.replace('A','a'));
       System.out.println(a.replace("Automation", "Manual"));//replace
       String s= "Test Batch 63";
       System.out.println(s.replaceAll("[a-z]", ""));//replaceAll
       System.out.println(s.replaceAll("[A-Z]", ""));
       System.out.println(s.replaceAll("[0-9]", ""));
       System.out.println(s.charAt(5));//charAt
       System.out.println(s.indexOf('B'));//indexOf

	}

}
