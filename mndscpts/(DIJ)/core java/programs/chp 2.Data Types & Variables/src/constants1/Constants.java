package constants1;
//Constants 
public class Constants {

	public static void main(String[] args) {
		final double CM_PER_INCH=2.54; // use final to denote constant
		double paperWidth=8.5;
		double paperHeight=11;
		System.out.println("Paper size in centimeters "+paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

	}

}
