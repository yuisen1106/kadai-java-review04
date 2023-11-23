package animal;

public class Human extends Animal implements Thinkable {

	   private String hobby;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Human() {
	}

	public Human(String name,int age,String hobby) {
		super.setName(name);
		super.setAge(age);
		this.hobby=hobby;


	}


	public void think() {
		System.out.println("私は"+this.hobby+"について考えています。");

	}

	}

