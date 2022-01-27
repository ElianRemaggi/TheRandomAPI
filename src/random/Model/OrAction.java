package random.Model;

public class OrAction implements IAction{
	
	private Object[] objectArray;
	
	public OrAction(Object o1, Object o2) {
		this.objectArray = new Object[2];
		objectArray[0]=o1;
		objectArray[1]=o2;
	}
	
	public Object orOperate() {
		RangeAction rango = new RangeAction(0,1);
		int indiceResultado = rango.calculateRange();
		return this.objectArray[indiceResultado];
	}
	
}
