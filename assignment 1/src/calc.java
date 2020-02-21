
public class calc implements ICalculator {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public float divide(int x, int y)throws RuntimeException {
		if(x!=0) {
		if (y==0) {
			throw new RuntimeException("Can't divide by zero");
		}
		
		return (float) x/y;
	}
		else {
			return 0;
		}}

}
