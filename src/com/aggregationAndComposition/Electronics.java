package com.aggregationAndComposition;

class Charger {
	String brand;
	int voltage;

	public Charger(String brand, int voltage) {
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public int getVoltage() {
		return voltage;
	}

}

class OS {
	String name;
	String version;

	public OS(String name, String version) {
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

}

class Laptop {
	// ✅ Composition: Laptop *owns* the OS. Strong lifecycle binding.
	OS os = new OS("Windows", "11.2");

	// ✅ Aggregation: Charger is passed externally, not owned by Laptop.
	void hasA(Charger c) {
		System.out.println("Charger brand: " + c.getBrand());
		System.out.println("Charger voltage: " + c.getVoltage());
	}
}

public class Electronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger charger = new Charger("Lenovo", 65);
		Laptop laptop = new Laptop();
		System.out.println("OS of the Laptop : " + laptop.os.getName());
		System.out.println("Version of the OS : " + laptop.os.getVersion());

		System.out.println("Charger brand: " + charger.getBrand());
		System.out.println("Charger voltage: " + charger.getVoltage());

		// 1.- Proof for composition and aggregation
		laptop = null;
		System.out.println("Laptop is lost now");
		System.out.println("Charger brand: " + charger.getBrand());
		System.out.println("Charger voltage: " + charger.getVoltage());

		System.out.println("OS of the Laptop : " + laptop.os.getName());
		System.out.println("Version of the OS : " + laptop.os.getVersion());

		// 1.- when we ground the laptop reference to null, we can't access the OS
		// within it, this shows tight bounding/ Composition of laptop and OS
		// where as we can still access the charger, this shows the loose bounding/
		// aggregation of the laptop and charger
	}

}
//@formatter:off
/*
🔹 Concept: Aggregation vs Composition in Object-Oriented Programming

🔸 Definitions:

Composition: Strong "has-a" relationship. The composed object cannot exist independently.

e.g., OS is part of Laptop. If Laptop is destroyed, OS is lost.

Aggregation: Weak "has-a" relationship. Aggregated objects can exist independently.

e.g., Charger can exist even if the Laptop is gone.

🔸 Code Flow:

Laptop owns an OS → created internally in the class (composition)

Laptop uses an external Charger → passed in method (aggregation)

When laptop = null:

Accessing charger still works ✅ (aggregation)

Accessing laptop.os throws NullPointerException ❌ (composition)

🔄 Lifecycle Binding:

Composition: Lifecycle of OS is bound to Laptop

Aggregation: Charger lives outside the Laptop and survives independently

🧠 Analogy:

📱 A mobile phone composes its operating system — they come together

🔌 A phone aggregates a charger — it’s optional and replaceable

✅ Summary Table:

Concept			Bound Object Lives Outside?		Example				Binding
Composition		❌ No							Laptop → OS			Strong
Aggregation		✅ Yes							Laptop ↔ Charger	Loose
*/