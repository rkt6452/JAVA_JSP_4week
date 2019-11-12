package elevator;

public class ElevatorDisplay implements Observer {
	
	private ElevatorController controller;
	
	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}

	public void update() {
		// TODO Auto-generated method stub
		int curFloor = controller.getCurFloor();
		System.out.println("Elevator Display: " + curFloor);
	}

}
