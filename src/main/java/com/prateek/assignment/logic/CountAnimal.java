
package com.prateek.assignment.logic;

import org.apache.commons.lang.ArrayUtils;

import com.prateek.assignment.Animal;
import com.prateek.assignment.Bird;
import com.prateek.assignment.Chicken;
import com.prateek.assignment.ClownFish;
import com.prateek.assignment.Dolphin;
import com.prateek.assignment.Duck;
import com.prateek.assignment.Fish;
import com.prateek.assignment.Parrot;
import com.prateek.assignment.Rooster;
import com.prateek.assignment.Shark;
import com.prateek.constant.Numeral;
import com.prateek.constant.SoundConstant;
import com.prateek.inter.IFlyable;
import com.prateek.inter.ISoundable;
import com.prateek.inter.ISwimable;
import com.prateek.inter.IWalkable;

/**
 * This class contains logic to for counting of 
 * animals on a particular attribute.
 */
public class CountAnimal {

	/**
	 * This method contains logic for counting of animals
	 * on the basis of instance of  
	 * particular interface.
	 * @param animalArr
	 */
	public void logicCountAnimal(final Animal[] animalArr){
		int animalFly = Numeral.ZERO.getNum();
		int animalWalk = Numeral.ZERO.getNum();
		int animalSing = Numeral.ZERO.getNum();
		int animalSwim = Numeral.ZERO.getNum();

		// Check for not null of input parameter.
		if(ArrayUtils.isNotEmpty(animalArr)){

			// Iterate over each type of array
			for(final Animal animal : animalArr){

				if(animal instanceof IFlyable){
					animalFly++;
				}
				if(animal instanceof IWalkable){
					animalWalk++;
				}
				if(animal instanceof ISoundable){
					animalSing++;
				}
				if(animal instanceof ISwimable){
					animalSwim++;
				}
			}
			System.out.println("-*-*-*-*-*-*-*-*Animal Count Report Start*-*-*-*-*-*-*-*-*-*");
			System.out.println("Number of animals that can fly : "+animalFly);
			System.out.println("Number of animals that can walk : "+animalWalk);
			System.out.println("Number of animals that can sing : "+animalSing);
			System.out.println("Number of animals that can swim : "+animalSwim);
			System.out.println("-*-*-*-*-*-*-*-*Animal Count Report End*-*-*-*-*-*-*-*-*-*-*");
		}
	}

	/**
	 * This is main method for execution of animal count.
	 */
	public static void main(final String[] args) {
		// Create object of count animal class.
		final CountAnimal cntAnmObj = new CountAnimal();

		// Create input sample data set array.
		final Animal[] animalArr = new Animal[]{
				new Bird(SoundConstant.DEFAULT.getSound()),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin()
		};

		// Call method for counting of sample data set animals as input parameter.
		cntAnmObj.logicCountAnimal(animalArr);
	}
}