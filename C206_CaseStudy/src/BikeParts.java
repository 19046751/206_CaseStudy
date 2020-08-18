
public class BikeParts extends BikePartsDB{
		
		//declare class parameters
	private String partName;
	private String description;
	private boolean isAvailable;
		
		
		public BikeParts(String partName, String description, boolean isAvailable) {
			//initialize paramater
					
		}
		public String getPartName() {
			return partName;
		}
		public void setPartName(String partName) {
			this.partName = partName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}

		public String toString() {
			return description;
			//format string to return
		}
}
