package mypack;

public class abc {
			void add(int x, int y) {
				System.out.println("add 2 nos" +(x+y));
			}
			void add(int x,int y,int z) {
				System.out.println("add 3 nos" +(x+y+z));
			}
			public static void main(String[] args) {
				abc ob1= new abc();
				ob1.add(3,4);
				ob1.add(6,2,3);
			}
			

}
