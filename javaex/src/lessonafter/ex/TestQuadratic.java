package lessonafter.ex;

public class TestQuadratic {

	public static void main(String[] args) {
		Quadratic qua = new Quadratic(7,4,2);	
		System.out.println("("+qua.getTco()+")x^2+"+"("+qua.getOco()+")x+"+"("+qua.getFco()+")=0");
		System.out.println("x1="+qua.compute());
		System.out.println("x2="+qua.getFco()/(qua.getTco()*qua.compute()));
	}

}
