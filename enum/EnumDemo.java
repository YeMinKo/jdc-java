public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(Days.MON.getViewName());
	}
}

enum Days {
	MON("Monday") {
		public void log() {
			System.out.println("Today is Monday");
		}

		public String getViewName() {
		return "Modified";
	}
	}, TUE("Tuesday") {
		public void log() {
			System.out.println("Today is Tuesday");
		}
	};
	private String viewName;

	public abstract void log();

	Days(String viewName){
		this.viewName = viewName;
	}

	public String getViewName() {
		return viewName;
	}

	public String toString() {
		return getViewName();
	}
}