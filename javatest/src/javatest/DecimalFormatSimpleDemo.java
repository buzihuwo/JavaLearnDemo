package javatest;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {

	public static void main(String[] args) {
		SimgleFomat("###,###.###",123456.789);
		SimgleFomat("00000000.###kg",123456.789);
		SimgleFomat("00000000.000",123.78);
		
		UseApplyPattemMethodDomat("#.###%",0.789);
		UseApplyPattemMethodDomat("##.##",123456.784);
		UseApplyPattemMethodDomat("0.00\u2030",0.789);
		DecimalFormat myFomat = new DecimalFormat();
		myFomat.setGroupingSize(3);
		System.out.println(myFomat.format(564615646)); 
	}

	public static void SimgleFomat(String pattem, double value) {
		DecimalFormat myFomat = new DecimalFormat(pattem);
		String output = myFomat.format(value);
		System.out.println(value + " " + pattem + " " + output);
	}

	public static void UseApplyPattemMethodDomat(String pattem, double value) {
		DecimalFormat myFomat = new DecimalFormat();
		myFomat.applyPattern(pattem);
		System.out.println(value + " " + pattem + " " + myFomat.format(value));
	}

}
