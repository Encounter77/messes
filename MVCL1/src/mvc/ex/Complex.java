package mvc.ex;

public class Complex {
	private double real;
	private double image;

	public Complex(double real, double image) {
		this.real = real;
		this.image = image;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImage() {
		return image;
	}

	public void setImage(double image) {
		this.image = image;
	}

	public Complex add(Complex a) {
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real + real2;
		double newImage = image + image2;
		Complex result = new Complex(newReal, newImage);
		return result;
	}

	public Complex sub(Complex a) {
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real - real2;
		double newImage = image - image2;
		Complex result = new Complex(newReal, newImage);
		return result;
	}

	public Complex mul(Complex a) {
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real * real2 - image * image2;
		double newImage = image * real2 + real * image2;
		Complex result = new Complex(newReal, newImage);
		return result;
	}

	public Complex div(Complex a) {
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = (real * real2 + image * image2)
				/ (real2 * real2 + image2 * image2);
		double newImage = (image * real2 - real * image2)
				/ (real2 * real2 + image2 * image2);
		Complex result = new Complex(newReal, newImage);
		return result;
	}
}
