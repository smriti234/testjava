package employeedetail;

import java.util.HashSet;
import java.util.Set;

class Employed {
	int roll;
	String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object Id) {
		if (this == Id)
			return true;
		if (Id == null)
			return false;
		if (getClass() != Id.getClass())
			return false;
		Employed other = (Employed) Id;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
	public void setId(int i) {
		// TODO Auto-generated method stub

	}


	public static class Ideone {

		public  static void main(String[] args)throws java.lang.Exception {
			// TODO Auto-generated method stub
			// your code goes here
			Employed e1 = new Employed();
			Employed e2 = new Employed();

			e1.setId(101);
			e2.setId(101);

			//Prints 'true'
			System.out.println(e1.equals(e2));

			Set<Employed> employees = new HashSet<Employed>();
			employees.add(e1);
			employees.add(e2);

			System.out.println(employees);

		}



	}
}
