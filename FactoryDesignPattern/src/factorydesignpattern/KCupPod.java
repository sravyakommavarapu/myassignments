package factorydesignpattern;

public abstract class KCupPod {
	
		String name;

		
        Box box;
        Cups cups;
        Flavour flavour;
        Roast roast;
		abstract void prepare();

		void set() {
			System.out.println("cups are set in the boxes");
		}

		void fill() {
			System.out.println("cups are filled with desired falvour");
		}

		void pack() {
			System.out.println("cups are sealed and boxes are packed");
		}

		void setName(String name) {
			this.name = name;
		}

		String getName() {
			return name;
		}

		public String toString() {
			StringBuffer result = new StringBuffer();
			result.append("###  " + name +  "  ###   \n");
			if (box != null) {
				result.append(box);
				result.append("\n");
			}
			if (cups != null) {
				result.append(cups);
				result.append("\n");
			}
			if (flavour != null) {
				result.append(flavour);
				result.append("\n");
			}
			
			if (roast != null) {
				result.append(roast);
				result.append("\n");
			}
			
			return result.toString();
		
	}
}
