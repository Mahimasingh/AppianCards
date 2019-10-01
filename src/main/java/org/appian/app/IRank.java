package org.appian.app;
/*
 * @author : Mahima Singh
 * Rank interface provides abstract details of Card Rank
 */
public interface IRank {
	
	/*
	 * @return : String
	 * This function returns the string name of the rank
	 */
	String getName();
	/*
	 * @return : Integer
	 * This function returns the integral value of number of pips
	 */
	int getPips();
	/*
	 * @return :  A character
	 * This function returns the char short name of rank
	 */
	char getShortName();

}
