import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());

		System.out.println("Executing additional program...");
		
        additionalProgram();
    }

    public static void additionalProgram() {
        // Tambahkan logika program tambahan di sini
        System.out.println("Additional program executed!");
    }
}
