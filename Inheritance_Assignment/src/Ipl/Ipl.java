package Ipl;

  class Ipl {

//	Create class IPLTeam with method play. Create child classes of IPLTeam
//	called as CSK, RCB. In main, call play from child class objects.

	public void play() {
		System.out.println("Play ipl all matches");
	}

	class CSk extends Ipl {
		void displaymatch() {
			System.out.println("playmatch in ipl");
		}
	}

	class RCB extends CSk {
public	void display() {
			System.out.println("playmatch in ipl ");
		}
	}

	
}
