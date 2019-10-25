/*
 *Dillan Poorman
 *CSC205
 *09/30/2019
 *Class for fractions
 */
package exception_operations;

/**
 * Fraction class.
 * 
 * For use with Activity 2.
 *
 */
public class Fraction {

	private int numerator;
	private int denominator;

	
	/**
	 * Constructor with parameter
	 * 
	 * @param numerator numerator
	 * @param denominator denominator
	 */
	Fraction(int numerator, int denominator)  {
		
	   this.numerator = numerator;
	   this.denominator = denominator;
	}

	/**
	 * Get the numerator.
	 * 
	 * @return numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Set the numerator.
	 * 
	 * @param numerator numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * Get the denominator.
	 * 
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Set the denominator.
	 * 
	 * @param denominator denominator
	 * @throws DenominatorIsZeroException 
	 */
	public void setDenominator(int denominator) throws DenominatorIsZeroException{
		
		
		if(denominator == 0) {
			throw new DenominatorIsZeroException("Can't divide by zero!");
		}
		
		this.denominator = denominator;
		
	}

	/**
	 * Convert the fraction to a mixed number.
	 * 
	 * @return The mixed number.
	 */
	public String toMixedNumber() {

		String ret = "";
		int remainder = numerator % denominator;

		ret += numerator / denominator;
		ret += " ";
		if (remainder != 0) {
			ret += numerator % denominator;
			ret += "/";
			ret += denominator;
		}

		return ret;
	}

	/**
	 * Override of {@link java.lang.Object#toString} method.
	 */
	@Override
	public String toString() {
		String ret = Integer.toString(numerator) + "/" + denominator;
		return ret;
	}
	
}
