package common;

 enum Season{
SUMMAR(10),
WINTER(20),
RAINY(30),
SPRING(40);
	int value; 
	 private Season(int value) {
		 this.value=value;
	 }
}
public class Enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Season s=Season.WINTER;
    System.out.println(s.value);
    
    for(Season s2:Season.values()) {
    	System.out.println(s2+" "+s2.value);
        
    }
    System.out.println(s.valueOf("SUMMAR"));
    System.out.println(s.ordinal());
    
	}

}
